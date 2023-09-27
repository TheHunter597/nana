node{
    withCredentials([
        usernamePassword(
        credentialsId: 'nexus',
        usernameVariable: 'USERNAME',
        passwordVariable: 'PASSWORD'
    )]){
    stage('build'){
        echo "Building"
       if("$Username" == "nexus"){
        echo "correct"
       }else{
        echo "incorrect"
       }
    }}
}