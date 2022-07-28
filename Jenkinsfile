pipeline{
    agent any
    tools {
        maven 'Maven'
    }
    stages {
        stage('Build Maven') {
            steps{
              checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'sreenidhize', url: 'https://github.com/sreenidhize/BC-15-greencommunte.git']]])
                sh "pwd"
                sh "cd job-management-service"
                sh "mvn clean install"
                
            }
        }
    }                                                                                                  
                                
}                                                                                                         
