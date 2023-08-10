
pipeline {
  agent any
   tools {
           maven 'Maven 3.8.6'
          jdk 'JDK 8 CJ Hosted'
           git 'Default'
      }
stages{
 stage('Checkout') {
            when {
                           changeset "module1/**"
                       }
                       steps {
                           echo "Building module1"
                           dir('module1') {
                               sh 'mvn -B -ntp clean package'
                           }
                       }
               when {
                                          changeset "module2/**"
                                      }
                                      steps {
                                          echo "Building module2"
                                          dir('module2') {
                                              sh 'mvn -B -ntp clean package'
                                          }
                                      }
            }
            }

}
