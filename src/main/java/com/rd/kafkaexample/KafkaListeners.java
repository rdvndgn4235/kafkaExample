package com.rd.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Created at 6/24/22.
 *
 * @author Ridvan Dogan
 */
@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "rdcode",
            groupId = "rd"
    )
    void listener(String data){
        System.out.println("Listener recieved data: " + data );
    }


}
