node{
    withCredentials([
        usernamePassword(
        credentialsId: 'nexus',
        usernameVariable: 'USERNAME',
        passwordVariable: 'PASSWORD'
    )]){
    stage('build'){
        echo "Building"
        echo "Username {$USERNAME}"
        echo "Password {$PASSWORD}"
    }}
}