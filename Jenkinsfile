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
                     changedFiles = []
                        for (changeLogSet in currentBuild.changeSets) {
                            for (entry in changeLogSet.getItems()) { // for each commit in the detected changes
                                for (file in entry.getAffectedFiles()) {
                                    changedFiles.add(file.getPath()) // add changed file to list
                                }
                            }
                        }
                   }
                }
            }
        }
    }
