# kafka-example
Implementing producer/consumer for Kafka using Springboot

1. Download [Kakfa 2.13-3.2.1](https://www.apache.org/dyn/closer.cgi?path=/kafka/3.2.1/kafka_2.13-3.2.1.tgz) software

1. Unzip the file
    ```shell
    tar -xvzf kafka_2.13-3.2.1.tgz
    ```

1. Go to the kafka folder
    ```shell
    cd kafka_2.13-3.2.1
    ```

1. Run zookeeper 
    ```shell
    ./bin/zookeeper-server-start.sh config/zookeeper.properties
    ```

1. Run Kafka server broker
    ```shell
    ./bin/kafka-server-start.sh config/server.properties
    ```

1. Create a Java project with Spring Boot, for instance, using maven
   ```shell
   mvn archetype:generate \
      -DarchetypeArtifactId=maven-archetype-quickstart \
      -DgroupId=mx.isccarrasco.kafka \
      -DartifactId=kafka-sb-ms \
      -DarchetypeVersion=0.0.1-SNAPSHOT \
      -DinteractiveMode=false
   ```
   
   or for the case of SpringBoot, it highly recommended to use the [https://start.spring.io](https://start.spring.io)

1. Edit the `application.properties` file of the java project
to assign the port of the kafka server
   ```properties
   spring.kafka.bootstrap-servers=localhost:9092
   ```

1. Run consumer to read the information queued 
   ```shell
   ./bin/kafka-console-consumer.sh --topic isccarrasco --from-beginning --bootstrap-server localhost:9092
   ```

1. There is also available a REST API to send or add data to the queue
   ```shell
   http --json POST :8080/api/v1/messages message="api with kafka"
   ```