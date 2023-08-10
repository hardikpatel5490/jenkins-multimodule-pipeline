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
                      def changes = currentBuild.changeSets[0].items
                                          def module2Changes = changes.findAll { it.path.startsWith('module2/') }
                                          if (module2Changes) {
                                              echo "Changes detected in module2"
                                          } else {
                                              echo "No changes detected in module2"
                                          }
                   }
                }
            }
        }
    }
