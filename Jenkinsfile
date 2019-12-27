pipeline {
    agent {
        kubernetes {
            label "jenkins-pods-${UUID.randomUUID().toString()}"
            defaultContainer 'jnlp'
            yamlFile '.ci/pod.yaml'
        }
    }

    options {
        timestamps()
        disableConcurrentBuilds()
    }

    stages{
        stage('Run parallel') {
            parallel {
                stage('Run tests 1'){
                    steps {
                        container('gradle') {
                            withAllureUpload(serverId: 'default', projectId: "20", results: [[path: 'build/allure-results']], name: 'with_second') {
                                sh "gradle with_second"
                            }
                        }
                    }
                }
                stage('Run tests 2'){
                    steps {
                        container('gradle') {
                            withAllureUpload(serverId: 'default', projectId: "21", results: [[path: 'build/allure-results']], name: 'without_second') {
                                sh "gradle without_second"
                            }
                        }
                    }
                }
            }
        }
    }
}
