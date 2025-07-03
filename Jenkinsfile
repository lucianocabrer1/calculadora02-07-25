pipeline{
        agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "MAVEN_HOME"
    }

    stages {
        stage('Step 0 - HOLA MUNDO') {
                steps {
                   echo 'HOLA MUNDO'
                }
            }
        stage('Step 1 - CheckOut Code') {
            steps {
               checkout([
                    $class: 'GitSCM',
                    branches: [[name: '*/master']],
                    userRemoteConfigs: [[
                        url: 'https://github.com/lucianocabrer1/calculadora02-07-25',
                        credentialsId: 'github-credential-id'

                    ]],
                    extensions: [[$class: 'CleanBeforeCheckout']]
                ])
            }
        }
        stage('Step 2 - Compile Code') {
            steps {
               bat "mvn compile"
            }
        }
        stage('Step 3 - Run test') {
            steps {
               bat "mvn test"
            }
        }

    }
}