pipeline {
  agent any
  tools {
    maven 'Maven 3.9.0'
    jdk 'jdk17'
  }
  stages {
    stage('Module1') {
      when { changeset "module1/*" }
      stages {
        stage('Packaging') {
          steps {
            cd module1
            sh 'mvn  -B -ntp clean package'
            echo "Build is taking very long due to heavy work..."
            sleep 100000
          }
        }
        stage('Installing') {
          when { changeset "module1/*" }
          steps {
            cd module1
            sh 'mvn  -B -ntp install'
          }
        }
      }
    }
    stage('Module2') {
      when { changeset "module2/*" }
      stages {
        stage('Packaging') {
          steps {
            cd module2
            sh 'mvn  -B -ntp clean package'
            echo "Build is taking very long due to heavy work..."
            sleep 100000
          }
        }
        stage('Installing') {
          when { changeset "module1/*" }
          steps {
            cd module2
            sh 'mvn  -B -ntp install'
          }
        }
      }
    }
  }
}