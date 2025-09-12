pipeline {
  agent any
  environment {
    IMAGE = "<DOCKERHUB_USERNAME>/abhijitapp"
  }
  stages {
    stage('Checkout') {
      steps {
        git url: 'https://github.com/abhijit2812/abhijitapp.git', branch: 'main'
      }
    }
    stage('Build & Test') {
      steps {
        sh 'mvn -B clean package'
      }
    }
    stage('Build Docker Image') {
      steps {
        script {
          dockerImage = docker.build("${env.IMAGE}:latest")
        }
      }
    }
    stage('Push to DockerHub') {
      steps {
        withCredentials([usernamePassword(credentialsId: 'dockerhub', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
          sh '''
            echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin
            docker push ${IMAGE}:latest
          '''
        }
      }
    }
    stage('Deploy to Kubernetes') {
      steps {
        withCredentials([file(credentialsId: 'kubeconfig', variable: 'KUBECONFIG')]) {
          sh 'kubectl --kubeconfig=$KUBECONFIG apply -f k8s/'
        }
      }
    }
  }
  post {
    always {
      cleanWs()
    }
  }
}
