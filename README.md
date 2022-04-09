# kafka-example
Implementing producer/consumer for Kafka using Springbok

1. Download Kakfa
1. Run zookeeper ./bin/zookeeper-server-start.sh config/zookeeper.properties
1. Run server ./bin/kafka-server-start.sh config/server.properties  
1. Run consumer ./bin/kafka-console-consumer.sh --topic isccarrasco --from-beginning --bootstrap-server localhost:9092
