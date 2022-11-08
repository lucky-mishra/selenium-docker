pipeline {
    // master executor should be set to 0
    agent any
    stages {
       
        stage('Build Image') {
            steps {
                //sh
                bat "docker build -t mayankluckym/selenium-docker -f ./Dockerfile.txt ."
            }
        }
        stage('Push Image') {
            steps {
			    withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'pass', usernameVariable: 'user')]) {
                    //sh
			        bat "docker login --username=${user} --password=${pass}"
			        bat "docker push mayankluckym/selenium-docker:latest"
			    }                           
            }
        }
    }
}
