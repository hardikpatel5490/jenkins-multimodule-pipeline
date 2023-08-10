pipeline {
    agent any
    tools {
        maven 'Maven 3.8.6'
        jdk 'JDK 8 CJ Hosted'
        git 'Default'
    }
    environment {

       FOLDERS = []
            currentBuild.changeSets.each { changeLogSet ->
                changeLogSet.getItems().each { entry ->
                    entry.getAffectedFiles().each { file ->
                        folders << file.getPath().split('/')[0]
                    }
                }
            }
        FOLDERS = FOLDERS.unique();
    }
    stages {
        stage('Checkout') {
            steps {
                script {
                    def changedFolders = FOLDERS
                    echo "Changed folders: ${changedFolders}"

                    if (changedFolders.contains("module1")) {
                        echo "Folder1 or Folder2 changed"
                    }
                }
            }
        }
    }
}


