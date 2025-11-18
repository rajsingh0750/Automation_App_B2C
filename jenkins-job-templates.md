# Jenkins Job Templates for Mobile Automation

## 1. Smoke Test Job Template

### Job Name: `mobile-automation-smoke-tests`
### Job Type: Freestyle Project

**Description:**
Quick validation tests to ensure basic functionality works across platforms.

**Configuration:**
```xml
<project>
  <description>Smoke tests for mobile automation</description>
  <triggers>
    <hudson.triggers.SCMTrigger>
      <spec>H/30 * * * *</spec>
    </hudson.triggers.SCMTrigger>
  </triggers>
  <builders>
    <hudson.tasks.Shell>
      <command>
        mvn test -Dtest=SmokeTestRunner \
          -Dcucumber.filter.tags="@Smoke" \
          -DthreadCount=1
      </command>
    </hudson.tasks.Shell>
  </builders>
  <publishers>
    <hudson.tasks.junit.JUnitResultArchiver>
      <testResults>target/surefire-reports/*.xml</testResults>
    </hudson.tasks.junit.JUnitResultArchiver>
    <hudson.plugins.cucumber.CucumberReportPublisher>
      <jsonReportPath>target/cucumber-reports/cucumber.json</jsonReportPath>
    </hudson.plugins.cucumber.CucumberReportPublisher>
  </publishers>
</project>
```

---

## 2. Regression Test Job Template

### Job Name: `mobile-automation-regression-tests`
### Job Type: Multi-Configuration Project

**Description:**
Comprehensive regression tests across multiple devices and platforms.

**Configuration:**
```xml
<matrix-project>
  <description>Regression tests for mobile automation</description>
  <axes>
    <hudson.matrix.TextAxis>
      <name>PLATFORM</name>
      <values>
        <string>Android</string>
        <string>iOS</string>
      </values>
    </hudson.matrix.TextAxis>
    <hudson.matrix.TextAxis>
      <name>DEVICE</name>
      <values>
        <string>POCO C65</string>
        <string>iPhone 11</string>
      </values>
    </hudson.matrix.TextAxis>
  </axes>
  <builders>
    <hudson.tasks.Shell>
      <command>
        mvn test -Dtest=RegressionTestRunner \
          -DplatformName=${PLATFORM} \
          -DdeviceName=${DEVICE} \
          -Dcucumber.filter.tags="@Regression" \
          -DthreadCount=3
      </command>
    </hudson.tasks.Shell>
  </builders>
  <publishers>
    <hudson.tasks.junit.JUnitResultArchiver>
      <testResults>target/surefire-reports/*.xml</testResults>
    </hudson.tasks.junit.JUnitResultArchiver>
  </publishers>
</matrix-project>
```

---

## 3. Performance Test Job Template

### Job Name: `mobile-automation-performance-tests`
### Job Type: Pipeline

**Description:**
Performance and load testing for mobile applications.

**Pipeline Script:**
```groovy
pipeline {
    agent any
    stages {
        stage('Performance Tests') {
            steps {
                sh '''
                    mvn test -Dtest=PerformanceTestRunner \
                      -Dcucumber.filter.tags="@Performance" \
                      -DthreadCount=10
                '''
            }
        }
    }
    post {
        always {
            publishHTML([
                allowMissing: false,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'target/cucumber-reports',
                reportFiles: 'cucumber-html-reports',
                reportName: 'Performance Test Report'
            ])
        }
    }
}
```

---

## 4. BrowserStack Cloud Test Job Template

### Job Name: `mobile-automation-browserstack-tests`
### Job Type: Pipeline

**Description:**
Cloud-based testing using BrowserStack infrastructure.

**Pipeline Script:**
```groovy
pipeline {
    agent any
    environment {
        BROWSERSTACK_USERNAME = credentials('browserstack-username')
        BROWSERSTACK_ACCESS_KEY = credentials('browserstack-access-key')
    }
    stages {
        stage('BrowserStack Tests') {
            steps {
                sh '''
                    mvn test -Pbrowserstack \
                      -Dcucumber.filter.tags="@BrowserStack" \
                      -DthreadCount=5
                '''
            }
        }
    }
}
```

---

## 5. Nightly Build Job Template

### Job Name: `mobile-automation-nightly-build`
### Job Type: Pipeline

**Description:**
Comprehensive nightly testing including all test suites.

**Pipeline Script:**
```groovy
pipeline {
    agent any
    triggers {
        cron('H 1 * * *') // Run at 1 AM daily
    }
    stages {
        stage('Smoke Tests') {
            steps {
                sh 'mvn test -Dcucumber.filter.tags="@Smoke"'
            }
        }
        stage('Regression Tests') {
            steps {
                sh 'mvn test -Dcucumber.filter.tags="@Regression"'
            }
        }
        stage('Performance Tests') {
            steps {
                sh 'mvn test -Dcucumber.filter.tags="@Performance"'
            }
        }
    }
    post {
        always {
            emailext (
                subject: "Nightly Build Results - ${env.BUILD_NUMBER}",
                body: "Nightly build completed. Check console for details.",
                to: "team@company.com"
            )
        }
    }
}
```

---

## 6. Release Pipeline Job Template

### Job Name: `mobile-automation-release-pipeline`
### Job Type: Pipeline

**Description:**
Complete release pipeline with quality gates.

**Pipeline Script:**
```groovy
pipeline {
    agent any
    parameters {
        choice(
            name: 'ENVIRONMENT',
            choices: ['UAT', 'STAGING', 'PRODUCTION'],
            description: 'Target environment'
        )
        string(
            name: 'VERSION',
            defaultValue: '1.0.0',
            description: 'Release version'
        )
    }
    stages {
        stage('Code Quality Check') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Smoke Tests') {
            steps {
                sh 'mvn test -Dcucumber.filter.tags="@Smoke"'
            }
        }
        stage('Regression Tests') {
            when {
                anyOf {
                    params.ENVIRONMENT == 'STAGING'
                    params.ENVIRONMENT == 'PRODUCTION'
                }
            }
            steps {
                sh 'mvn test -Dcucumber.filter.tags="@Regression"'
            }
        }
        stage('Performance Tests') {
            when {
                params.ENVIRONMENT == 'PRODUCTION'
            }
            steps {
                sh 'mvn test -Dcucumber.filter.tags="@Performance"'
            }
        }
        stage('Deploy') {
            steps {
                sh "echo 'Deploying to ${params.ENVIRONMENT} environment'"
            }
        }
    }
}
```

---

## 7. Multi-Device Test Job Template

### Job Name: `mobile-automation-multi-device-tests`
### Job Type: Pipeline

**Description:**
Parallel testing across multiple devices and platforms.

**Pipeline Script:**
```groovy
pipeline {
    agent any
    stages {
        stage('Parallel Device Testing') {
            parallel {
                stage('Android Tests') {
                    steps {
                        sh '''
                            mvn test -DplatformName=Android \
                              -DdeviceName="POCO C65" \
                              -Dcucumber.filter.tags="@Android"
                        '''
                    }
                }
                stage('iOS Tests') {
                    steps {
                        sh '''
                            mvn test -DplatformName=iOS \
                              -DdeviceName="iPhone 11" \
                              -Dcucumber.filter.tags="@iOS"
                        '''
                    }
                }
            }
        }
    }
}
```

---

## Job Configuration Best Practices

### 1. **Build Triggers**
- **SCM Polling**: `H/15 * * * *` (Every 15 minutes)
- **Scheduled Builds**: `H 2 * * *` (Daily at 2 AM)
- **Manual Triggers**: Allow manual execution

### 2. **Build Environment**
- **Node Selection**: Use specific nodes for mobile testing
- **Workspace Cleanup**: Clean workspace before each build
- **Environment Variables**: Set platform-specific variables

### 3. **Build Steps**
- **Dependency Resolution**: `mvn clean dependency:resolve`
- **Test Execution**: Platform-specific test commands
- **Artifact Archiving**: Save test reports and logs

### 4. **Post-Build Actions**
- **Test Result Publishing**: JUnit, Cucumber, Allure reports
- **Email Notifications**: Success/failure notifications
- **Slack Integration**: Real-time notifications
- **Artifact Archiving**: Long-term storage of reports

### 5. **Advanced Configuration**
- **Build Retention**: Keep last 30 builds
- **Concurrent Builds**: Limit to 2 per node
- **Build Timeout**: 60 minutes maximum
- **Parameterized Builds**: Environment and device selection
