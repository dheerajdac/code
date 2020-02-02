pipeline {

    environment {
        test = 'test'
    }

    agent {
        docker {
            image 'dheerajdac/ubuntu:9'
            args '-v $HOME/.m2:/root/.m2 -v /var/run/docker.sock:/var/run/docker.sock'
        }
    }

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean install -DskipTests'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post{
        always{
            sh 'mvn clean'
        }
    }

}
