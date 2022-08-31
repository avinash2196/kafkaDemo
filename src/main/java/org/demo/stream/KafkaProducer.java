package org.demo.stream;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.demo.data.KafkaRepository;
import org.demo.model.KafkaModel;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {
    private static final String topic = "companies";
    private final KafkaTemplate<String, KafkaModel> kafkaTemplate;
    public void produce(KafkaModel model)
    {
        log.info("Outgoing Message - Producing -> {}", model);
        this.kafkaTemplate.send(topic, model);


    }
}
