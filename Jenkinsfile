pipeline {
    agent any

    tools {
//         jdk 'JDK-21'          // must match name in Jenkins → Tools
        gradle 'Gradle-8.5'   // must match name in Jenkins → Tools
    }

    triggers {
        githubPush()
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
//                 sh 'java -version'
                sh 'gradle --version'
                sh 'gradle clean build'
            }
        }
    }
}
