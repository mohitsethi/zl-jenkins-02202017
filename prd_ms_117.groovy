freeStyleJob('sample-app-from-dsl') {
    // name 'digital-item/trueman_stage1_topology_deployment'
    description("Do not change this config directly.")
    // jdk("JDK 1.7.0_67")
    // label 'ms_docker'
    wrappers {
      timestamps()
    }
    logRotator(-1, 10000, 5, -1)
    scm {
        git {
            remote {
                url("https://github.com/mohitsethi/maven-sample-app")
            }
            branch("master")
            // wipeOutWorkspace true
        }
    }

    triggers {
        cron('* * * * *')
    }

    steps {
        shell("mvn clean install")
        shell("ls -alh")
        shell("ls -alh")
    }

    publishers {
        archiveArtifacts('**/*.war')
    }
}
