node{
    withCredentials([
        usernamePassword(
        credentialsId: 'dockerhup',
        usernameVariable: 'USERNAME',
        passwordVariable: 'PASSWORD'
    )]){
    stage('build'){
        script{
            def userInput=input(
            id:'userInput',
            message: 'Please enter version to use',
            ok:"Proceed",
            parameters: [
                string(name: 'Version',defaultValue:'', description: 'Version to build')
            ]
        )
            sh "echo ${PASSWORD} | docker login -u ${USERNAME} --password-stdin"
            echo "Building version ${userInput}"
            sh "docker build -t thehunter597/mongobun:${userInput} ."
            sh "docker push thehunter597/mongobun:${userInput}"
            echo "Done"

        }

    }}
}
