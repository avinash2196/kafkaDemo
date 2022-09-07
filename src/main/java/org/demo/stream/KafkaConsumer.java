package org.demo.stream;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class KafkaConsumer {

    @Bean
    public Consumer<KStream<String, String>> consumerModel() {
        return stream -> stream.foreach((key, value) -> System.out.println("Number Consumed : " +key+ "-"+ value));
    }

    ;

}
