pipelineJob('example') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/jenkinsci/job-dsl-plugin.git')
            }
        }
    }
}
pipeline('shellcommand') {
    agent { label 'master' }
    stages {
        stage('build') {
            steps {
                echo "Hello World!"
                sh "echo Hello from the shell"
                sh "hostname"
                sh "uptime"
            }
        }
    }
}