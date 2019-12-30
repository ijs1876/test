pipeline {
  agent any
  stages {
    stage('test') {
      parallel {
        stage('test') {
          steps {
            echo 'aaaa'
          }
        }
        stage('') {
          steps {
            echo 'test2'
          }
        }
      }
    }
  }
}