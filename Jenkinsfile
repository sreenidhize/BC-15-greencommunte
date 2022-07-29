pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage("Build maven") {
            steps {
                sh "cd job-management-service ; mvn clean -DskipTests ; ls"
            }    
                
        }
    }
    
}
