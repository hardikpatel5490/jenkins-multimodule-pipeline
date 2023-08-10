pipeline {
    agent any
    tools {
        maven 'Maven 3.8.6'
        jdk 'JDK 8 CJ Hosted'
        git 'Default'
    }
    script{
       folders = []
            currentBuild.changeSets.each { changeLogSet ->
                changeLogSet.getItems().each { entry ->
                    entry.getAffectedFiles().each { file ->
                        folders << file.getPath().split('/')[0]
                    }
                }
            }
        folders = folders.unique();
    }
    stages {
        stage('Checkout') {
            steps {
                script {
                    def changedFolders = folders
                    echo "Changed folders: ${changedFolders}"

                    if (changedFolders.contains("module1")) {
                        echo "Folder1 or Folder2 changed"
                    }
                }
            }
        }
    }
}


