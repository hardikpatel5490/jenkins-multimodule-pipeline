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
                        def scmVars = checkout([
                                               $class: 'GitSCM',
                                               branches: [[name: '*/main']], // Specify the branch you want to checkout
                                               userRemoteConfigs: [[
                                                   url: 'https://github.com/hardikpatel5490/jenkins-multimodule-pipeline.git', // Replace with your Git repository URL

                                               ]]
                                           ])

                                           // Get the list of changes from the retrieved changeset
                                           def changes = scmVars.GIT_COMMITTER_NAME.collect { author ->
                                               [
                                                   author: author,
                                                   changes: scmVars.CURRENT_COMMIT_MSG
                                               ]
                                           }
                                           echo "Changes: ${changes}"
                   }
                }
            }
        }
    }
