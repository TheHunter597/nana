node{
    withCredentials([
        usernamePassword(
        credentialsId: 'nexus',
        usernameVariable: 'USERNAME',
        passwordVariable: 'PASSWORD'
    )]){
    stage('build'){
        echo "Building"
<<<<<<< HEAD
=======
        def currentVersion= params.Version
        echo "${currentVersion}"
>>>>>>> ec81217 (added som params)
       if("$Username" == "nexus_1"){
        echo "correct"
       }else{
        echo "incorrect"
       }
    }}
}
