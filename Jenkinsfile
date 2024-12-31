pipeline {
    agent any

    stages {
        stage('Playwright run test') {
            steps {
                sh '''
                    mvn compile exec:java -Dexec.mainClass="com.modern.firstProject" \
                '''
            }
        }
    }
}