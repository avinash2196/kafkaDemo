package org.demo.stream;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.demo.model.KafkaModel;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {
    private static final String topic = "companies";
    private final StreamBridge bridge;

    public void produce(KafkaModel model) {
        bridge.send(topic, model);
    }

}
