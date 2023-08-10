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
                         scmVars = checkout scm
                      echo "BRANCH_NAME: ${scmVars.GIT_BRANCH}"
                      changeSets = currentBuild.changeSets
                   }
                }
            }
        }
    }
