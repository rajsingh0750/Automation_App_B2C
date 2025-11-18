pipeline {
    agent any
    
    environment {
        // Maven Configuration
        MAVEN_HOME = '/usr/share/maven'
        PATH = "${MAVEN_HOME}/bin:${PATH}"
        
        // Test Configuration
        TEST_ENVIRONMENT = 'UAT'
        BROWSERSTACK_USERNAME = credentials('browserstack-username')
        BROWSERSTACK_ACCESS_KEY = credentials('browserstack-access-key')
        
        // Device Configuration
        ANDROID_DEVICE_NAME = 'POCO C65'
        ANDROID_UDID = 'DQE6O78HZP9HPF5H'
        IOS_DEVICE_NAME = 'iPhone 11'
        IOS_UDID = '00008030-001605CE3CD2802E'
        
        // Reporting
        ALLURE_RESULTS = 'target/allure-results'
        CUCUMBER_REPORTS = 'target/cucumber-reports'
    }
    
    options {
        // Build retention
        buildDiscarder(logRotator(numToKeepStr: '10'))
        
        // Timeout
        timeout(time: 60, unit: 'MINUTES')
        
        // Timestamps
        timestamps()
        
        // AnsiColor for better console output
        ansiColor('xterm')
    }
    
    stages {
        stage('Checkout & Setup') {
            steps {
                script {
                    echo "🚀 Starting Mobile Automation Pipeline"
                    echo "Branch: ${env.BRANCH_NAME}"
                    echo "Build Number: ${env.BUILD_NUMBER}"
                }
                
                // Clean workspace
                cleanWs()
                
                // Checkout code
                checkout scm
                
                // Setup Java
                sh '''
                    echo "Setting up Java environment..."
                    java -version
                    mvn -version
                '''
            }
        }
        
        stage('Dependency Resolution') {
            steps {
                script {
                    echo "📦 Resolving Maven dependencies..."
                }
                
                sh '''
                    mvn clean dependency:resolve dependency:resolve-plugins
                '''
            }
        }
        
        stage('Code Quality Check') {
            parallel {
                stage('Android Smoke Tests') {
                    when {
                        anyOf {
                            branch 'main'
                            branch 'develop'
                            changeRequest()
                        }
                    }
                    steps {
                        script {
                            echo "🤖 Running Android Smoke Tests..."
                        }
                        
                        sh '''
                            mvn test -Dtest=SmokeTestRunner \
                                -DplatformName=Android \
                                -DdeviceName="${ANDROID_DEVICE_NAME}" \
                                -Dudid="${ANDROID_UDID}" \
                                -Dcucumber.filter.tags="@Smoke" \
                                -DthreadCount=1
                        '''
                    }
                    post {
                        always {
                            // Archive test results
                            archiveArtifacts artifacts: 'target/cucumber-reports/**/*', allowEmptyArchive: true
                            archiveArtifacts artifacts: 'target/logs/**/*', allowEmptyArchive: true
                        }
                        failure {
                            script {
                                echo "❌ Android Smoke Tests Failed"
                                currentBuild.result = 'UNSTABLE'
                            }
                        }
                    }
                }
                
                stage('iOS Smoke Tests') {
                    when {
                        anyOf {
                            branch 'main'
                            branch 'develop'
                            changeRequest()
                        }
                    }
                    steps {
                        script {
                            echo "🍎 Running iOS Smoke Tests..."
                        }
                        
                        sh '''
                            mvn test -Dtest=iOSSmokeTestRunner \
                                -DplatformName=iOS \
                                -DdeviceName="${IOS_DEVICE_NAME}" \
                                -Dudid="${IOS_UDID}" \
                                -Dcucumber.filter.tags="@Smoke" \
                                -DthreadCount=1
                        '''
                    }
                    post {
                        always {
                            archiveArtifacts artifacts: 'target/cucumber-reports/**/*', allowEmptyArchive: true
                            archiveArtifacts artifacts: 'target/logs/**/*', allowEmptyArchive: true
                        }
                        failure {
                            script {
                                echo "❌ iOS Smoke Tests Failed"
                                currentBuild.result = 'UNSTABLE'
                            }
                        }
                    }
                }
            }
        }
        
        stage('Regression Testing') {
            when {
                anyOf {
                    branch 'main'
                    branch 'develop'
                }
            }
            parallel {
                stage('Android Regression') {
                    steps {
                        script {
                            echo "🔄 Running Android Regression Tests..."
                        }
                        
                        sh '''
                            mvn test -Dtest=AndroidRegressionRunner \
                                -DplatformName=Android \
                                -DdeviceName="${ANDROID_DEVICE_NAME}" \
                                -Dudid="${ANDROID_UDID}" \
                                -Dcucumber.filter.tags="@Regression" \
                                -DthreadCount=3
                        '''
                    }
                    post {
                        always {
                            archiveArtifacts artifacts: 'target/cucumber-reports/**/*', allowEmptyArchive: true
                            archiveArtifacts artifacts: 'target/logs/**/*', allowEmptyArchive: true
                        }
                    }
                }
                
                stage('iOS Regression') {
                    steps {
                        script {
                            echo "🔄 Running iOS Regression Tests..."
                        }
                        
                        sh '''
                            mvn test -Dtest=iOSRegressionRunner \
                                -DplatformName=iOS \
                                -DdeviceName="${IOS_DEVICE_NAME}" \
                                -Dudid="${IOS_UDID}" \
                                -Dcucumber.filter.tags="@Regression" \
                                -DthreadCount=3
                        '''
                    }
                    post {
                        always {
                            archiveArtifacts artifacts: 'target/cucumber-reports/**/*', allowEmptyArchive: true
                            archiveArtifacts artifacts: 'target/logs/**/*', allowEmptyArchive: true
                        }
                    }
                }
            }
        }
        
        stage('BrowserStack Testing') {
            when {
                anyOf {
                    branch 'main'
                    changeRequest()
                }
            }
            steps {
                script {
                    echo "☁️ Running BrowserStack Cloud Tests..."
                }
                
                sh '''
                    mvn test -Pbrowserstack \
                        -Dcucumber.filter.tags="@BrowserStack" \
                        -DthreadCount=5
                '''
            }
            post {
                always {
                    archiveArtifacts artifacts: 'target/cucumber-reports/**/*', allowEmptyArchive: true
                    archiveArtifacts artifacts: 'target/logs/**/*', allowEmptyArchive: true
                }
            }
        }
        
        stage('Performance Testing') {
            when {
                branch 'main'
            }
            steps {
                script {
                    echo "⚡ Running Performance Tests..."
                }
                
                sh '''
                    mvn test -Dtest=PerformanceTestRunner \
                        -Dcucumber.filter.tags="@Performance" \
                        -DthreadCount=10
                '''
            }
            post {
                always {
                    archiveArtifacts artifacts: 'target/cucumber-reports/**/*', allowEmptyArchive: true
                    archiveArtifacts artifacts: 'target/logs/**/*', allowEmptyArchive: true
                }
            }
        }
    }
    
    post {
        always {
            script {
                echo "📊 Pipeline execution completed"
                echo "Build Status: ${currentBuild.result ?: 'SUCCESS'}"
                echo "Build Duration: ${currentBuild.durationString}"
            }
            
            // Clean up workspace
            cleanWs()
        }
        
        success {
            script {
                echo "✅ All tests passed successfully!"
            }
            
            // Send success notification
            emailext (
                subject: "✅ Mobile Automation Tests PASSED - Build #${env.BUILD_NUMBER}",
                body: """
                    <h2>Mobile Automation Test Results</h2>
                    <p><strong>Build:</strong> #${env.BUILD_NUMBER}</p>
                    <p><strong>Branch:</strong> ${env.BRANCH_NAME}</p>
                    <p><strong>Status:</strong> ✅ PASSED</p>
                    <p><strong>Duration:</strong> ${currentBuild.durationString}</p>
                    <p><strong>Console:</strong> <a href="${env.BUILD_URL}console">View Console</a></p>
                """,
                to: "${env.CHANGE_AUTHOR_EMAIL ?: 'team@company.com'}",
                mimeType: 'text/html'
            )
        }
        
        failure {
            script {
                echo "❌ Tests failed!"
            }
            
            // Send failure notification
            emailext (
                subject: "❌ Mobile Automation Tests FAILED - Build #${env.BUILD_NUMBER}",
                body: """
                    <h2>Mobile Automation Test Results</h2>
                    <p><strong>Build:</strong> #${env.BUILD_NUMBER}</p>
                    <p><strong>Branch:</strong> ${env.BRANCH_NAME}</p>
                    <p><strong>Status:</strong> ❌ FAILED</p>
                    <p><strong>Duration:</strong> ${currentBuild.durationString}</p>
                    <p><strong>Console:</strong> <a href="${env.BUILD_URL}console">View Console</a></p>
                    <p><strong>Test Reports:</strong> <a href="${env.BUILD_URL}testReport/">View Test Results</a></p>
                """,
                to: "${env.CHANGE_AUTHOR_EMAIL ?: 'team@company.com'}",
                mimeType: 'text/html'
            )
        }
        
        unstable {
            script {
                echo "⚠️ Tests completed with warnings!"
            }
        }
    }
}
