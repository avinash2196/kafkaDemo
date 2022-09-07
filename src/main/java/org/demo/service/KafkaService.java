package org.demo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.demo.data.KafkaRepository;
import org.demo.model.KafkaData;
import org.demo.model.KafkaModel;
import org.demo.stream.KafkaProducer;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaService {
    private final KafkaProducer kafkaProducer;
    private final KafkaRepository kafkaRepository;

    public void sendMessage(KafkaModel kafkaModel) {
        log.info("data is : {}", kafkaModel);
        kafkaProducer.sendMessage(String.valueOf(kafkaModel));
        KafkaData kafkaData = new KafkaData();
        kafkaData.setData(kafkaModel.getData());
        kafkaRepository.save(kafkaData);


    }
}
