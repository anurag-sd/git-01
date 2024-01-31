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
                sh '/opt/apache-maven-3.9.6/bin/mvn clean package'
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
