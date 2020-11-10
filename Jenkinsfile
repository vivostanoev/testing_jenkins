pipeline {
    agent none
    stages {
        stage('Pull Maven')
        {
            agent
            {
            docker {
                image 'maven:3-alpine'
                args '-v /root/.m2:/root/.m2'
                }
            }
        }
        stage('Pull JDK 1.8')
        {
            agent{
                docker {
                    image 'anapsix/alpine-java'
                }
            }
        }
        stage('Pull Chrome Driver standalone'){
            agent{
                docker {
                    image 'selenium/standalone-chrome'
                }
            }
        }
        stage('Build Maven') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}