def buildStage() {
      steps {
          sh 'mvn clean install -DskipTests'
      }
}
