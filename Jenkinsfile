pipeline{
    agent any
    tools {
        maven 'Maven'
    }
    stages {
        stage('Build Maven') {
            steps{
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
                
            }
        }
    }                                                                                                  
                                
}                                                                                                         
