node{
    withCredentials([
        usernamePassword(
        credentialsId: 'nexus',
        usernameVariable: 'USERNAME',
        passwordVariable: 'PASSWORD'
    )]){
    stage('build'){
        echo "Building ma"
        def currentVersion= params.Version
        echo "${currentVersion}"
       if("$Username" == "nexus_1"){
        echo "correct"
       }else{
        echo "incorrect"
       }
    }}
}
