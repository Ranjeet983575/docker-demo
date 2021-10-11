pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                echo 'Compiling..'
                bat "mvn clean compile"
            }
        }
        stage('Unit Test') {
            steps {
                echo 'Testing..'
                bat "mvn test"
            }
        }
        stage('Build') {
            steps {
                echo 'Building....'
                bat "mvn package"
            }
        }
    }
}