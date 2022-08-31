package org.demo.stream;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Slf4j
public class KafkaConsumer {
    @KafkaListener(topics = "companies", groupId = "group_id")
    public void consume(String data)
    {
        log.info("Incoming Message - Consuming -> {}", data);
    }
}
