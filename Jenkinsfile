pipeline {
    agent any
     tools{
        maven 'Maven'
    }

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'Maven') {
                    sh "cd ./job-management-service ; pwd ; mvn install -DskipTests"
                }
            }
        }

    }
}
