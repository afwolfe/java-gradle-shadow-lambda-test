#!/bin/sh
dockerfile="Dockerfile"
docker build -t java-lambda-test:latest -f $dockerfile .
