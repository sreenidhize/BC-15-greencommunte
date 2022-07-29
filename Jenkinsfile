pipeline {
    agent any
    tools {
        maven 'Maven'
    }
    stages {
        stage("Build Maven") {
            steps {
                sh "cd job-management-service ; mvn clean -DskipTests ; ls"
            }    
                
        }
    }
    
}