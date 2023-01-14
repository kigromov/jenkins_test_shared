pipeline {
  agent {
      docker {
        label 'windows'
        image 'python:3.7'
    }
  stages {
    stage('Test') {
      steps {
        sh 'node --version'
      }
    }
  }
}
