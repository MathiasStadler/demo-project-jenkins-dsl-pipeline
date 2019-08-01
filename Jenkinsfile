// Mandatory - Set the following Git repository in the Source control management section:
// https://github.com/JFrog/project-examples.git
pipelineJob('job-dsl-artifactory-pipeline-example') {
    parameters {
        }

    definition {
        cps {
            script(readFileFromWorkspace('jenkins-examples/pipeline-examples/declarative-example/Jenkinsfile'))
            sandbox()
        }
    }
}