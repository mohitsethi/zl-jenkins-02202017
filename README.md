# Jenkins 


## Installation instructions for Ubuntu/Debian
  - Step1: wget -q -O - https://pkg.jenkins.io/debian-stable/jenkins.io.key | sudo apt-key add -
  - Step2: add `deb https://pkg.jenkins.io/debian-stable binary/` to /etc/apt/sources.list
  - Step3: Install Jenkins
    ```
      sudo apt-get update
      sudo apt-get install jenkins
    ```


## Sample app - Maven
  - Repository: https://github.com/mohitsethi/maven-sample-app


## Remote execution: Jenkins CLI


## Jenkins DSL
  - https://jenkinsci.github.io/job-dsl-plugin
  - http://job-dsl.herokuapp.com/
  

## Docker
  - Prerequisite:
    - install docker-engine on all slave (wherever relevant)
  - install docker plugins
  - Job configuration
  - Dockerfile reference: https://docs.docker.com/engine/reference/builder/
  - Cleanup(for standalone docker host) Jenkins slave: 
      ```
        sudo docker rm -f $(sudo docker ps -aq)
      ```

  