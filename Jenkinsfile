pipeline {
    agent any
        
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
          stage('Run myscript') {
            steps {
                sh 'ls'
                sh 'sudo ./myscript.sh'
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
