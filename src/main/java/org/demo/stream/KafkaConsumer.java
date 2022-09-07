package org.demo.stream;

import lombok.extern.slf4j.Slf4j;
import org.demo.model.KafkaModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
@Slf4j
public class KafkaConsumer {

    @Bean
    Consumer<KafkaModel> receive() {

        return s -> System.out.println("Received Model: " + s);

    }
}
