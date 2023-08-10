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
                    if (changeset(["module1/**"]).toBoolean()) {
                        echo "Building module2"
                    }
                }
            }
        }
    }
}
