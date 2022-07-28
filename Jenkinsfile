pipeline{
    agent any
    tools {
        maven 'Maven'
    }
    stages {
        stage('Build Maven') {
            steps{
              checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'sreenidhize', url: '...]]])
                sh "pwd"
                sh "cd BC-15-greencommunte/job-management-service"
                sh "mvn clean install"
                
            }
        }
    }                                                                                                  
                                
}                                                                                                         
