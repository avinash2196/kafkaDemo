package org.demo.controller;
import lombok.RequiredArgsConstructor;
import org.demo.model.KafkaModel;
import org.demo.service.KafkaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
@RequiredArgsConstructor
public class KafkaController {
    private final KafkaService kafkaService;
    @PostMapping(value = "/send", consumes={"application/json"}, produces = {"application/json"})
    public void sendMessageToKafkaTopic(@RequestBody KafkaModel kafkaModel)
    {
        kafkaService.sendMessage(kafkaModel);
    }
}
