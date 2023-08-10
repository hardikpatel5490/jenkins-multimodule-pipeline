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
                    def changes = changeset(['module1/**'])
                    if (!(changes.isEmpty().asBoolean())) {
                        echo "Building module1"
                    }
                    if (changeset("module2/**").asBoolean()) {
                          echo "Building module2"
                    }
                }
            }
        }
    }
}
