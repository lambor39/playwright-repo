pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {
        stage('Clone project') {
            steps {
                git 'https://github.com/lambor39/playwright-repo.git'
            }
        }

        stage('Run Test') {
            steps {
                sh  '''
                        mvn clean test -DtargetBrowser= -DisRunWithHeadless=yes -DisMaximumMode=yes
                '''
            }
        }
    }
}