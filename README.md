# java-lambda-test

A small project to experiment with deploying Java applications to AWS Lambda with Docker.

## Overview

The project is built with:
* Docker
* Java 11
* Gradle
  * [shadow](https://github.com/johnrengelman/shadow) plugin

The project will build and deploy a fat/uber JAR to the Lambda Docker container.

## Usage
Included are a pair of basic shell scripts, `build.sh` and `run.sh` which will build and start the container locally:
1. Build the Docker image:
   * `docker build -t java-lambda-test:latest -f Dockerfile .`
   * Use Dockerfile.dev to just copy the locally built jar into the image for faster testing.
2. Run the Docker image:
   * `docker run -p 9000:8080 java-lambda-test:latest`
3. Use an API client or `curl` to invoke the Lambda:
   * `curl -XPOST "http://localhost:9000/2015-03-31/functions/function/invocations" -d '{"name":"afwolfe", "id":1}'`

## Acknowledgements/Resources
* [Deploying Java application on AWS Lambda using Docker](https://medium.com/@MustehssunI/deploying-java-application-on-aws-lambda-using-docker-a95f6fc159da) by Mustehssun Iqbal
  * [Mustehssun/shady-aws-lambda](https://github.com/Mustehssun/shady-aws-lambda)
* AWS Documentation
  * [Deploy Java Lambda functions with container images](https://docs.aws.amazon.com/lambda/latest/dg/java-image.html)
  * [Testing Lambda container images locally](https://docs.aws.amazon.com/lambda/latest/dg/images-test.html)