pipeline {
    agent any
    environment{
        VERSION="1.0.3"
    }
    stages{
        stage("build"){
            steps{
                script{
                    load "stages/build.groovy"
                }
            }
        }
        stage("test"){
            steps{
                 script{
                    load "stages/test.groovy"
                }
            }
        }
        stage("deploy"){
            steps{
                 script{
                    load "stages/deploy.groovy"
                }
            }
        }
    }
}
