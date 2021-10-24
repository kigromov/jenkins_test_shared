package main.groovy.pipelines

pipeline {
    agent {
        label any
    }

    stages {
        stage("start test") {
            steps {
              startTests()
            }
        }
    }
}
