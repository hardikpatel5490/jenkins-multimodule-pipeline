// pipeline {
//     agent any
//     options {
//             sandbox false
//         }
//     tools {
//         maven 'Maven 3.8.6'
//         jdk 'JDK 8 CJ Hosted'
//         git 'Default'
//     }
//     stages {
//         stage('Build') {
//             steps {
//                 script {
//                     echo"Building the project";
//                     def changeset = checkout([$class: 'GitSCM', branches: [[name: '*/main']], userRemoteConfigs: [[url: 'https://github.com/hardikpatel5490/jenkins-multimodule-pipeline.git']]])
//                      echo"Building the {changeset}";
//                     for (change in changeset) {
//                         if (change.path.startsWith("module1/")) {
//                             dir('module1') {
//                                 sh 'mvn -B -ntp clean package'
//                                 echo "Build for module1 completed."
//                             }
//                         }
//
//                         if (change.path.startsWith("module2/")) {
//                             dir('module2') {
//                                 sh 'mvn -B -ntp clean package'
//                                 echo "Build for module2 completed."
//                             }
//                         }
//                     }
//                 }
//             }
//         }
//     }
// }
//

pipeline {
  agent any
   tools {
           maven 'Maven 3.8.6'
          jdk 'JDK 8 CJ Hosted'
           git 'Default'
      }
  stages {
    stage('Module1') {
    steps {
       script {
            def changeset = checkout(
                                    changelog: true,
                                    poll: false,
                                    scm: [$class: 'GitSCM', branches: [[name: '*/main']], userRemoteConfigs: [[url: 'https://github.com/hardikpatel5490/jenkins-multimodule-pipeline.git']]])
            echo "Building the changeset: ${changeset}"
            for (change in changeset) {
                if (change.path.startsWith("module1/")) {
                    dir('module1') {
                        sh 'mvn -B -ntp clean package'
                        echo "Build for module1 completed."
                    }
                }
            }

       }
    }
 }
}
