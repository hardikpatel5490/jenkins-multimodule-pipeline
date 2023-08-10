 changedFolders = []
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
                     //changedFolders = []
                        for (changeLogSet in currentBuild.changeSets) {
                            for (entry in changeLogSet.getItems()) { // for each commit in the detected changes
                                for (file in entry.getAffectedFiles()) {
                                  folderName = file.getPath().split('/')[0]
                                    changedFolders.add(folderName) // add changed file to list
                                }
                            }
                        }
                        changedFolders = changedFolders.unique();
                        echo "Changed files: ${changedFolders.unique()}"
                        if(changedFolders.contains("module1")) {
                            echo "Folder1 or Folder2 changed"
                        }
                   }
                }
           }
           stage('Build') {
                steps {
                    script {
                        if(changedFolders.contains("module1")) {
                             dir ('module1') {
                               echo "module1 Build is taking very long due to heavy work..."
                            }
                        }
                        if(changedFolders.contains("module2")) {
                             dir ('module2') {
                               echo "module2 Build is taking very long due to heavy work..."
                            }
                        }
                    }
                }
           }
        }
    }
