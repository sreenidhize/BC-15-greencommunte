pipeline{
    agent any
    tools {
        maven 'Maven'
    }
    stages {
        stage('Build Maven') {
            steps{
                sh "pwd"
                sh "cd BC-15-greencommunte/job-management-service"
                sh "mvn clean install"
                
            }
        }
    }                                                                                                  
                                
}                                                                                                         
