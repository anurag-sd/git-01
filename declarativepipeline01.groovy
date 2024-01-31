pipeline {
    agent any
    stages {
        stage('pull') {
            steps {
                git 'https://github.com/anurag-sd/studentapp.ui.git'
                echo 'pull completed'
            }
        }
        stage('build') {
            steps {
                sh '/usr/bin/mvn clean package'
                echo 'build completed'
            }
        }
        stage('test') {
            steps {
                echo 'test completed'
            }
        }
    }
}
