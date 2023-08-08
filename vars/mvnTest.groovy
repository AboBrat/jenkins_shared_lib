def call(){
    // sh 'mvn test'
    sh 'mvn install -DskipTests'
}