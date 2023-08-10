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
//                       echo "BRANCH_NAME: ${scmVars.GIT_BRANCH}"
                     changeSets =  checkout scm.pollingBaseline

                        echo "changeSets: ${changeSets}"
                        for (entry in changeSets) {
                                                for (path in entry.affectedPaths) {
                                                    // Extract the folder name from the path
                                                     folderName = path.path.split('/')[0]
                                                    echo "Folder Name: ${folderName}"
                                                }
                                            }
                   }
                }
            }
        }
    }
