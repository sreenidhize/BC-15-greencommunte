pipeline {
    agent any
     tools{
        maven 'Maven'
    }

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'maven') {
                    sh "cd ./job-management-service ; pwd ; mvn install -DskipTests"
                }
            }
        }

    }
}
