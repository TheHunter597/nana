#! groovy
pipeline {
    agent any
    environment{
        VERSION="1.0.3"
    }
    parameters{
        choice(name:"Version", choices: ["1.0.5","1.0.6"], description: "Version to build")
    }
    stages{
        stage("build"){
            steps{
                script{
                    build=load "stages/build.groovy"
                    build.buildApp()
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
