pipeline {
    agent any
    stages {
        stage('get docker image') {
            steps {
                sh 'docker-compose.yml up'
            }
        }
         stage('Test') {

                    steps {
                        sh 'mvn clean install'
                    }
                }
    }
}