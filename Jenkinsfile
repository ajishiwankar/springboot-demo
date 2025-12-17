pipeline {
    agent any

    tools {
        gradle 'Gradle-8.4'
    }

    options {
        disableConcurrentBuilds()
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                    sh 'java -version'
                    sh 'gradle --version'
                    sh 'gradle clean build'
            }
        }
    }
}
