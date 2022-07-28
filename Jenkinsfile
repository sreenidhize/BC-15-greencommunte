pipeline{
    agent any
    tools {
        maven 'Maven'
    }
    stages {
        stage('Build Maven') {
            steps{
                sh "cd job-service"
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
                
            }
        }
    }                                                                                                  
                                
}                                                                                                         
