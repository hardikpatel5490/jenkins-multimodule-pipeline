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
                       checkout scm

                                          // Get the changeset for the specified path
                                          def changes = git(
                                              branch: 'master', // Specify the branch you want to check
                                              changelog: true,
                                              poll: false // Disable automatic polling for changes
                                          )

                                          if (changes.any()) {
                                              echo "Changes detected in module2:"
                                              for (change in changes) {
                                                  echo "Commit: ${change.commitId}"
                                                  echo "Author: ${change.author}"
                                                  echo "Message: ${change.msg}"
                                              }
                                          } else {
                                              echo "No changes detected in module2"
                                          }
                   }
                }
            }
        }
    }
