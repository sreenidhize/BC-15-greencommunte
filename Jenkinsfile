pipeline{
    agent any
    tools {
        maven 'MAVEN'
    }
    stages {
        stage('Build Maven') {
            steps{
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
                
            }
        }
    }                                                                                                  
                                
}                                                                                                         
