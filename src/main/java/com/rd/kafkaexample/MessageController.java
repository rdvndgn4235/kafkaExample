package com.rd.kafkaexample;

import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created at 6/24/22.
 *
 * @author Ridvan Dogan
 */
@RestController
@RequestMapping("api/v1/messages")
@AllArgsConstructor
public class MessageController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping
    public void publish(@RequestBody MessageRequest request){
        kafkaTemplate.send("rdcode", request.message());
    }

}
