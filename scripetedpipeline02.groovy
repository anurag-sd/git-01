node {
    stage('pull') {
        echo 'pull completed'
    }
    stage('build') {
        echo 'build completed'
    }
    stage('test') {
        echo 'test completed'
    }
    stage('deploy') {
        echo 'deploy completed'
    }
}
