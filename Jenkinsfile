pipeline {
    agent none
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