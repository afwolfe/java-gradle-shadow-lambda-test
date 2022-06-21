FROM amazoncorretto:11-al2-jdk as build

WORKDIR /src
COPY app/ ./
RUN ./gradlew build --info

FROM public.ecr.aws/lambda/java:11

COPY --from=build /src/build/libs/app-all.jar ${LAMBDA_TASK_ROOT}/lib/

CMD [ "com.afwolfe.lambdatest.MyHandler::handleRequest" ]
