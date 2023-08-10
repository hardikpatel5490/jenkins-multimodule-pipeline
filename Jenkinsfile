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
                      def scmVars = checkout scm
                                          def changes = scmVars.GIT_COMMIT
                                          echo "Changeset: ${changes}"
                   }
                }
            }
        }
    }
