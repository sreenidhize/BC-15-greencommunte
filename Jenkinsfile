pipeline{
    agent any
    tools {
        maven 'Maven'
    }
    stages {
        stage('Build Maven') {
            steps{
                sh "job-management-service"
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
                
            }
        }
    }                                                                                                  
                                
}                                                                                                         
