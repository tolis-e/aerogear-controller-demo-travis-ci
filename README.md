## Aerogear Controller Demo Travis CI
This project contains the [Aerogear Controller Demo](https://github.com/tolis-e/aerogear-controller-demo-travis-ci/blob/master/aerogear-controller-demo) and the [Aerogear Controller Demo Test](https://github.com/tolis-e/aerogear-controller-demo-travis-ci/blob/master/aerogear-controller-demo-test) subprojects. Its purpose is to demonstrate how to setup an [Arquillian](http://arquillian.org/) test which requires a browser and a managed container, to run on [Travis CI](https://travis-ci.org/). The [Aerogear Controller Demo Test](https://github.com/tolis-e/aerogear-controller-demo-travis-ci/blob/master/aerogear-controller-demo-test) project contains the functional test for the [Aerogear Controller Demo](https://github.com/tolis-e/aerogear-controller-demo-travis-ci/blob/master/aerogear-controller-demo) project. 

The idea is that we have a parent project which hosts both the project which is under testing and the project which contains the tests. Every time we push something on the repository, the corresponding build is triggered on [Travis CI](https://travis-ci.org/) and we can verify whether the tests passed or not.

[![Build Status](https://travis-ci.org/tolis-e/aerogear-controller-demo-travis-ci.png?branch=master)](https://travis-ci.org/tolis-e/aerogear-controller-demo-travis-ci)

We use the X Virtual Framebuffer to run tests that require a web browser, on [Travis CI](https://travis-ci.org/).

## AeroGear Controller Demo Test
This project contains the functional test for the [AeroGear Controller Demo](https://github.com/tolis-e/aerogear-controller-demo-travis-ci/blob/master/aerogear-controller-demo) project.

The [Arquillian](http://arquillian.org/) testing platform is used to enable the testing automation. [Arquillian](http://arquillian.org/) integrates transparently with the testing framework which is JUnit in this case.

### Functional Test Content
The AeroGear Controller Demo Functional Test defines the three core aspects needed for the execution of an [Arquillian](http://arquillian.org/) test case:

- container — the runtime environment
- deployment — the process of dispatching an artifact to a container
- archive — a packaged assembly of code, configuration and resources

The container's configuration resides in the [Arquillian XML](https://github.com/tolis-e/aerogear-controller-demo-travis-ci/blob/master/aerogear-controller-demo-test/src/test/resources/arquillian.xml) configuration file while the deployment and the archive are defined in the [Deployments](https://github.com/tolis-e/aerogear-controller-demo-travis-ci/blob/master/aerogear-controller-demo-test/src/test/java/org/jboss/aerogear/controller/demo/test/Deployments.java) file.

The test case is dispatched to the container's environment through coordination with ShrinkWrap, which is used to declaratively define a custom Java EE archive that encapsulates the test class and its dependent resources. [Arquillian](http://arquillian.org/) packages the ShrinkWrap defined archive at runtime and deploys it to the target container. It then negotiates the execution of the test methods and captures the test results using remote communication with the server. Finally, [Arquillian](http://arquillian.org/) undeploys the test archive.

The [POM](https://github.com/tolis-e/aerogear-controller-demo-travis-ci/blob/master/aerogear-controller-demo-test/pom.xml) file contains two profiles:

* arq-jboss-managed — managed container 
* arq-jboss-remote — remote container

By default the arq-jboss-managed (managed container) profile is active. An Arquillian managed container is a remote container whose lifecycle is managed by [Arquillian](http://arquillian.org/). The specific profile is also configured to download and unpack the JBoss Application Server 7 distribution zip from the Maven Central repository.

### Development approach/methodologies
The development approach is driven from the desire to decouple the testing algorithmic steps / scenarios from the implementation which is tied to a specific DOM structure. For that reason the Page Objects and Page Fragments patterns are used. The Page Objects pattern is used to encapsulate the tested page's structure into one class which contains all the page's parts together with all methods which you will find useful while testing it. The Page Fragments pattern encapsulates parts of the tested page into reusable pieces across all your tests.

### Functional Test Execution
The execution of the functional test is done through maven:

    mvn test

### Documentation

* [Arquillian Guides](http://arquillian.org/guides/)

## AeroGear Controller Demo - very lean MVC controller
[AeroGear Controller](https://github.com/aerogear/aerogear-controller) is a very lean model view controller written in Java. It focuses on the routing of HTTP request to plain Java object endpoint and the handling of the returned result. The result of 
an invocation is either forwarded to a view, or returned in the format requested by the caller

This project show cases some of the functionality of AeroGear Controller.
