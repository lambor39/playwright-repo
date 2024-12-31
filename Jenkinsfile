pipeline {
    agent any

    stages {
        stage('Playwright run test') {
            agent {
                docker {
                    image 'openjdk:17-alpine'
                    image 'maven:3.9.9-amazoncorretto-17-debian'
                    //reuseNote true
                }
            }
            steps {
                sh '''
                    mvn compile exec:java -Dexec.mainClass="com.modern.firstProject" \
                '''
            }
        }
    }
}