pipeline {
    agent any
    tools {
        maven 'Maven 3.8.6'
        jdk 'JDK 8 CJ Hosted'
        git 'Default'
    }
    stages {
        stage('Checkout') {
            steps {
                script {

                    if (changeset("module2/**").toBoolean()) {
                        echo "Building module1"
                    }
                    if (changeset("module2/**").toBoolean()()) {
                          echo "Building module2"
                    }
                }
            }
        }
    }
}
