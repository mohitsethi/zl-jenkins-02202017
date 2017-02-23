# Jenkins 
  - http://jenkins-ci.org/
  - https://jenkins.io

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

  
## Monitoring
  - https://www.icinga.com/



## Continous Deployment 
  - Sample App(Java container: Tomcat)
    - Build used: http://www-us.apache.org/dist/tomcat/tomcat-9/v9.0.0.M17/bin/apache-tomcat-9.0.0.M17.tar.gz
      - Installation steps used:
        - wget http://www-us.apache.org/dist/tomcat/tomcat-9/v9.0.0.M17/bin/apache-tomcat-9.0.0.M17.tar.gz
        - chmod +x apache-tomcat-9.0.0.M17.tar.gz
        - tar xvzf apache-tomcat-9.0.0.M17.tar.gz
      - start tomcat
        - command: /opt/tomcat/apache-tomcat-9.0.0.M17/bin/startup.sh
      - tailf /opt/tomcat/apache-tomcat-9.0.0.M17/logs/catalina.out

  - Sample App (DOcker way)
    - Pre-requisite:
      - Have atleast one machine running docker engine, and accepting remote connections.
      - Add docker slave(requires Docker slave plugin)

    - Build a container image.


## Notifications
  - prerequisite:
    - HipChat Plugin
    - Hipchat Account
  -
