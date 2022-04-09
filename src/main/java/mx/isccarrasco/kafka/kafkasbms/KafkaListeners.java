package mx.isccarrasco.kafka.kafkasbms;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "isccarrasco", groupId = "messagesId")
    void listener(String data) {
        System.out.println("Listener received: " + data + " 🤗 ");
    }

}
