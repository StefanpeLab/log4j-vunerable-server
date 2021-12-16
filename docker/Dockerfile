FROM jamesdbloom/docker-java8-maven as maven-builder
ENV JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64/jre
RUN mkdir -p /app
WORKDIR /app/
RUN git clone https://github.com/ankur-katiyar/log4j-vunerable-server.git
WORKDIR /app/log4j-vunerable-server/
RUN mvn clean install
CMD ["bash"]