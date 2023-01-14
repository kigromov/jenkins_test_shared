pipeline {
  agent {
      docker {
        label 'docker'
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
