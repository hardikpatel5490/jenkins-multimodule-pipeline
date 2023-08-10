def getAffectedFiles(){
    folderList = []
    for (changeLogSet in currentBuild.changeSets) {
        for (entry in changeLogSet.getItems()) { // for each commit in the detected changes
            for (file in entry.getAffectedFiles()) {
                folderName = file.getPath().split('/')[0]
                folderList.add(folderName)
            }
        }
    }
    return folderList.unique()
}

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
                    def changedFolders = getAffectedFiles()
                    echo "Changed folders: ${changedFolders}"

                    if (changedFolders.contains("module1")) {
                        echo "Folder1 or Folder2 changed"
                    }
                }
            }
        }
    }
}
