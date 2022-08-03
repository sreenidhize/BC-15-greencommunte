pipeline {
    agent any
    environment {
		DOCKERHUB_CREDENTIALS=credentials('35ce32b6-d3b7-4ce8-af1a-6391cf65ce77')
	}

    tools {
        maven 'Maven'
    }
    stages {
        stage("Build Maven") {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '35ce32b6-d3b7-4ce8-af1a-6391cf65ce77', url: 'https://github.com/sreenidhize/BC-15-greencommunte']]])
                sh "cd job-management-service ; mvn clean install -DskipTests ; ls"
            }    
                
        }
        stage('Docker Build') {
          steps {
            sh "cd job-management-service ; ls ; docker build -t ghcr.io/sreenidhize/greenc15:latest ."
            sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login ghcr.io -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
            sh "docker push ghcr.io/sreenidhize/greenc15:latest"
		  
      }
    }
       stage('Deploy to eks') {
          steps {
            script{
              sh 'kubectl apply -f job-management-service/deployment.yaml'
            }
            
      }
    }
    
}
}