pipeline {
    agent any
    tools {
        maven 'Maven 3.8.6'
        jdk 'JDK 8 CJ Hosted'
        git 'Default'
    }
    stages {

        stage('Build') {
            steps {
                script {
//                    def changeset = scm.changeset
                    echo "changeset: ${scm}"
//
//                    if ($changeset == "module1/**")
//                        dir('module1') {
//                            sh 'mvn  -B -ntp clean package'
//                            echo "Build is taking very long due to heavy work..."
//                            sh 'sleep 100'
//                        }
//
//                    if ($changeset == "module2/**") {
//                        dir('module2') {
//                            sh 'mvn  -B -ntp clean package'
//                            echo "Build is taking very long due to heavy work..."
//                            sh 'sleep 100'
//                        }
//                    }
//                    for (change in changeset) {
//                        if (change.path.startsWith("module1/")) {
//                            dir('module1') {
//                                sh 'mvn -B -ntp clean package'
//                                echo "Build is taking a while due to heavy work..."
//                                sh 'sleep 100'
//                            }
//                        }
//                        if (change.path.startsWith("module2/")) {
//                            dir('module2') {
//                                sh 'mvn -B -ntp clean package'
//                                echo "Build is taking a while due to heavy work..."
//                                sh 'sleep 100'
//                            }
//                        }
//                    }
                }
            }
        }
    }

//        stage('Install') {
//            steps {
//                script {
//                    if (scm.changeset == "module1/**") {
//                        dir('module1') {
//                            sh 'mvn  -B -ntp install'
//                        }
//                    }
//                    if (scm.changeset == "module2/**") {
//                        dir('module2') {
//                            sh 'mvn  -B -ntp install'
//                        }
//                    }
//                }
//            }
//        }
}