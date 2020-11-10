pipeline {
    agent none
    stages {
        stage('Pull JDK8') {
            agent {
                docker { image 'anapsix/alpine-java' }
            }
            steps {
                sh 'anapsix/alpine-java'
            }
        }
        stage('Pull standalone') {
                    agent {
                        docker { image 'selenium/standalone-chrome' }
                    }
                    steps {
                        sh 'docker run -d -P selenium/standalone-chrome'
                    }
        }
         stage('Pull Maven') {
                    agent {
                        docker { image 'maven:3-alpine' }
                    }
                    steps {
                        sh 'mvn clean install'
                    }
                }
    }
}