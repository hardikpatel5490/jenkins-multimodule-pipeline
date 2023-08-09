pipeline {
    agent any
    tools {
        maven 'Maven 3.8.6'
        jdk 'JDK 8 CJ Hosted'
        git 'Default'
    }
    stages {
        stage('Build') {
            when { changeset "module1/**" }
            steps {
                dir('module1') {
                    sh 'mvn  -B -ntp clean package'
                    echo "Build is taking very long due to heavy work..."
                    sh 'sleep 100'
                }
            }
            when { changeset "module2/**" }
            steps {
                dir('module2') {
                    sh 'mvn  -B -ntp clean package'
                    echo "Build is taking very long due to heavy work..."
                    sh 'sleep 100'
                }
            }

        }

        stage('Install') {
            when { changeset "module1/**" }
            steps {
                dir('module1') {
                    sh 'mvn  -B -ntp install'
                }
            }
            when { changeset "module2/**" }
            steps {
                dir('module2') {
                    sh 'mvn  -B -ntp install'
                }
            }
            when { changeset "module1/**" 'or' changeset "module2/**" }
            steps {
                sh 'echo "Build is taking very long due to heavy work... both modules check"'
            }
        }
    }
}
