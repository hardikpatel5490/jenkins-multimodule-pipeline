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
                     changedFolders = []
                        for (changeLogSet in currentBuild.changeSets) {
                            for (entry in changeLogSet.getItems()) { // for each commit in the detected changes
                                for (file in entry.getAffectedFiles()) {
                                  folderName = file.getPath().split('/')[0]
                                    changedFolders.add(folderName) // add changed file to list
                                }
                            }
                        }
                        if (!changedFolders.empty) {
                                                echo "Changed folders: ${changedFolders.join(', ')}"
                                                // Add your further steps or conditions here
                                            } else {
                                                echo "No changes found in the specified folders."
                                            }
                        echo "Changed files: ${changedFolders}"
                   }
                }
            }
        }
    }
