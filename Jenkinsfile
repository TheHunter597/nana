#! groovy
// testmanererer
@Library('shared-jenkins-library') _
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
                    def userInput = input(
                        id:"userInput",
                        message:"Select a version to build maaan",
                        parameters:[
                            string(name:"Version")
                        ]
                    )
                    dockerLogin 'dockerhup'
                    dockerBuild '1.0.3'
                    dockerPush '1.0.3'
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
