def buildStage() {
    sh 'mvn clean install -DskipTests'
}
