pipeline {
    agent any
    stages {
        stage('get docker image') {
            steps {
                sh 'docker-compose up -d'
            }
        }
         stage('Test') {

                    steps {
                        sh 'mvn clean install'
                    }
                }
    }
}