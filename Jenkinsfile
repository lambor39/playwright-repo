pipeline {
    agent any

    stages {
        stage('Playwright run test') {
            agent {
                docker {
                    image 'openjdk:17-alpine'
                    reuseNote true
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