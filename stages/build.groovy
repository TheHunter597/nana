def buildApp(){
    def userInput=input(
        id:'userInput',
        message: 'Please enter version to use',
        ok:"Proceed",
        parameters: [
            string(name: 'Version',defaultValue:'', description: 'Version to build')
        ]
    )
    withCredentials([
        usernamePassword(
        credentialsId: 'dockerhup',
        usernameVariable: 'USERNAME',
        passwordVariable: 'PASSWORD'
    )]){
        sh "echo ${PASSWORD} | docker login -u ${USERNAME} --password-stdin"
        echo "Building version ${userInput}"
        sh "docker build -t thehunter597/mongobun:${userInput} ."
        sh "docker push thehunter597/mongobun:${userInput}"
        echo "Done"
    }
}
return this
