pipeline {
    agent any
    
    tools {
        maven 'M3'
    }

    stages {
        stage('Checkout'){
            steps {
                git url: 'https://github.com/lambor39/testPipeline-repo.git', branch: 'main'
            }
        }
        stage('Clone project') {
            steps {
                git 'https://github.com/lambor39/playwright-repo.git'
            }
        }

        stage('Run Test') {
            steps {
                sh  '''
                        mvn clean test -DtargetBrowser= -DisRunWithHeadless=yes -DisMaximumMode=yes -Djava.awt.headless=true
                '''
            }
        }
    }
}