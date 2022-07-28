pipeline{
    agent any
    tools {
        maven 'Maven'
    }
    stages {
        stage('Build Maven') {
            steps{
              checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '71ea6737-a4f7-4dff-9598-4f87baebf3d6', url: 'https://github.com/sreenidhize/BC-15-greencommunte.git']]])
                sh "pwd"
                sh "cd job-management-service"
                sh "mvn clean install"
                
            }
        }
    }                                                                                                  
                                
}                                                                                                         
