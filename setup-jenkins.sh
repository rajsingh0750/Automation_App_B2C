#!/bin/bash

# ===========================================
# Jenkins Setup Script for Mobile Automation
# ===========================================

set -e

# Colors for output
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m' # No Color

# Function to print colored output
print_status() {
    echo -e "${BLUE}[INFO]${NC} $1"
}

print_success() {
    echo -e "${GREEN}[SUCCESS]${NC} $1"
}

print_warning() {
    echo -e "${YELLOW}[WARNING]${NC} $1"
}

print_error() {
    echo -e "${RED}[ERROR]${NC} $1"
}

# Function to check if command exists
command_exists() {
    command -v "$1" >/dev/null 2>&1
}

# Function to install Java
install_java() {
    print_status "Installing Java 20..."
    
    if command_exists java; then
        java_version=$(java -version 2>&1 | head -n 1 | cut -d'"' -f2 | cut -d'.' -f1)
        if [ "$java_version" -ge 20 ]; then
            print_success "Java $java_version is already installed"
            return 0
        fi
    fi
    
    # Install OpenJDK 20
    sudo apt-get update
    sudo apt-get install -y openjdk-20-jdk
    
    # Set JAVA_HOME
    echo 'export JAVA_HOME=/usr/lib/jvm/java-20-openjdk-amd64' >> ~/.bashrc
    echo 'export PATH=$JAVA_HOME/bin:$PATH' >> ~/.bashrc
    
    print_success "Java 20 installed successfully"
}

# Function to install Maven
install_maven() {
    print_status "Installing Maven..."
    
    if command_exists mvn; then
        print_success "Maven is already installed"
        return 0
    fi
    
    sudo apt-get install -y maven
    
    print_success "Maven installed successfully"
}

# Function to install Jenkins
install_jenkins() {
    print_status "Installing Jenkins..."
    
    if command_exists jenkins; then
        print_success "Jenkins is already installed"
        return 0
    fi
    
    # Add Jenkins repository key
    curl -fsSL https://pkg.jenkins.io/debian-stable/jenkins.io-2023.key | sudo tee /usr/share/keyrings/jenkins-keyring.asc > /dev/null
    
    # Add Jenkins repository
    echo deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc] https://pkg.jenkins.io/debian-stable binary/ | sudo tee /etc/apt/sources.list.d/jenkins.list > /dev/null
    
    # Update package list and install Jenkins
    sudo apt-get update
    sudo apt-get install -y jenkins
    
    # Start and enable Jenkins
    sudo systemctl start jenkins
    sudo systemctl enable jenkins
    
    print_success "Jenkins installed and started successfully"
}

# Function to install Jenkins plugins
install_jenkins_plugins() {
    print_status "Installing Jenkins plugins..."
    
    # Wait for Jenkins to start
    sleep 30
    
    # Get Jenkins CLI
    sudo wget http://localhost:8080/jnlpJars/jenkins-cli.jar -O /tmp/jenkins-cli.jar
    
    # Install required plugins
    plugins=(
        "workflow-aggregator"
        "git"
        "maven-plugin"
        "cucumber-reports"
        "allure-jenkins-plugin"
        "email-ext"
        "slack"
        "build-timeout"
        "timestamper"
        "ansicolor"
        "throttle-concurrents"
        "build-discarder"
        "parameterized-trigger"
        "multijob"
        "parallel-test-executor"
        "testng-results"
        "junit"
        "htmlpublisher"
        "cobertura"
        "jacoco"
        "performance"
        "browserstack-integration"
        "appium"
        "mobile-testing"
    )
    
    for plugin in "${plugins[@]}"; do
        print_status "Installing plugin: $plugin"
        java -jar /tmp/jenkins-cli.jar -s http://localhost:8080 install-plugin "$plugin" -deploy
    done
    
    print_success "Jenkins plugins installed successfully"
}

# Function to configure Jenkins
configure_jenkins() {
    print_status "Configuring Jenkins..."
    
    # Create Jenkins directories
    sudo mkdir -p /var/lib/jenkins/jobs
    sudo mkdir -p /var/lib/jenkins/workspace
    
    # Set proper permissions
    sudo chown -R jenkins:jenkins /var/lib/jenkins
    
    # Copy job configuration
    if [ -f "jenkins-job-config.xml" ]; then
        sudo cp jenkins-job-config.xml /var/lib/jenkins/jobs/mobile-automation/config.xml
        sudo chown jenkins:jenkins /var/lib/jenkins/jobs/mobile-automation/config.xml
    fi
    
    # Copy environment configuration
    if [ -f "jenkins-environment.properties" ]; then
        sudo cp jenkins-environment.properties /var/lib/jenkins/
        sudo chown jenkins:jenkins /var/lib/jenkins/jenkins-environment.properties
    fi
    
    print_success "Jenkins configured successfully"
}

# Function to setup Appium
setup_appium() {
    print_status "Setting up Appium..."
    
    # Install Node.js
    if ! command_exists node; then
        curl -fsSL https://deb.nodesource.com/setup_18.x | sudo -E bash -
        sudo apt-get install -y nodejs
    fi
    
    # Install Appium
    sudo npm install -g appium@2.0.0
    
    # Install Appium drivers
    sudo appium driver install uiautomator2
    sudo appium driver install xcuitest
    
    print_success "Appium setup completed"
}

# Function to setup Android SDK
setup_android_sdk() {
    print_status "Setting up Android SDK..."
    
    # Install Android SDK
    sudo apt-get install -y android-sdk
    
    # Set environment variables
    echo 'export ANDROID_HOME=/usr/lib/android-sdk' >> ~/.bashrc
    echo 'export PATH=$ANDROID_HOME/tools:$ANDROID_HOME/platform-tools:$PATH' >> ~/.bashrc
    
    print_success "Android SDK setup completed"
}

# Function to create Jenkins user
create_jenkins_user() {
    print_status "Creating Jenkins user..."
    
    # Create jenkins user if it doesn't exist
    if ! id "jenkins" &>/dev/null; then
        sudo useradd -m -s /bin/bash jenkins
    fi
    
    # Add jenkins user to required groups
    sudo usermod -aG docker jenkins
    sudo usermod -aG sudo jenkins
    
    print_success "Jenkins user created successfully"
}

# Function to setup Docker (for containerized testing)
setup_docker() {
    print_status "Setting up Docker..."
    
    if command_exists docker; then
        print_success "Docker is already installed"
        return 0
    fi
    
    # Install Docker
    curl -fsSL https://get.docker.com -o get-docker.sh
    sudo sh get-docker.sh
    
    # Add jenkins user to docker group
    sudo usermod -aG docker jenkins
    
    # Start Docker service
    sudo systemctl start docker
    sudo systemctl enable docker
    
    print_success "Docker setup completed"
}

# Function to display Jenkins information
display_jenkins_info() {
    print_success "Jenkins setup completed!"
    echo ""
    echo "==========================================="
    echo "Jenkins Information:"
    echo "==========================================="
    echo "Jenkins URL: http://localhost:8080"
    echo "Initial Admin Password: $(sudo cat /var/lib/jenkins/secrets/initialAdminPassword)"
    echo "Jenkins User: jenkins"
    echo "Jenkins Home: /var/lib/jenkins"
    echo ""
    echo "Next Steps:"
    echo "1. Open http://localhost:8080 in your browser"
    echo "2. Enter the initial admin password"
    echo "3. Install suggested plugins"
    echo "4. Create admin user"
    echo "5. Configure job from jenkins-job-config.xml"
    echo "==========================================="
}

# Main installation function
main() {
    print_status "Starting Jenkins setup for Mobile Automation..."
    
    # Update system
    sudo apt-get update
    
    # Install required packages
    install_java
    install_maven
    create_jenkins_user
    setup_docker
    install_jenkins
    install_jenkins_plugins
    configure_jenkins
    setup_appium
    setup_android_sdk
    
    # Restart Jenkins
    sudo systemctl restart jenkins
    
    display_jenkins_info
}

# Run main function
main "$@"
