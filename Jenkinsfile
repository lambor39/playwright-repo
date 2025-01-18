pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven 'M3'
    }

    stages {
        stage('Clone project') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/lambor39/playwright-repo.git'
            }
        }
/*
        stage('Build') {
            steps {
                // Run Maven on a Unix agent.
                sh  '''
                        mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="install msedge"
                        mvn -Dmaven.test.failure.ignore=true clean package
                '''
            }
        }
    */
        stage('Run Test') {
            steps {
                // Run Maven on a Unix agent.
                /*
                sh  '''
                        mvn compile exec:java -Dexec.mainClass="com.modern.firstProject.App"
                '''
                */
                sh  '''
                        mvn clean test
                '''
            }
        }
    }
}
