pipeline {
    agent none
    stages {
        stage('Pull JDK8') {
            agent {
                docker { image 'anapsix/alpine-java' }
            }
            steps {
                echo 'JDK is installed'
            }
        }
        stage('Pull standalone') {
                    agent {
                        docker { image 'selenium/standalone-chrome' }
                    }
                    steps {
                        echo 'chrome is installed'
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