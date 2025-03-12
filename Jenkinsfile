pipeline {
    agent any
    stages {
        stage('Checkout Code') {
            steps {
                git 'https://github.com/Rajvinayallam/git-maven-simple.git'
            }
        }
        stage('Build') {
            steps {
        		withEnv(["PATH+MAVEN=D:\\WiproTraining\\apache-maven-3.9.9\\bin"]) {
            		sh 'mvn clean package'
        	}
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                bat 'java -jar target/git-maven-simple-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
 