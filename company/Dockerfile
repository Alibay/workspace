FROM java:8-jre
MAINTAINER Ibraim ALibay <alibay@cookbyte.com>

ADD ./target/company.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/company.jar"]

EXPOSE 6000