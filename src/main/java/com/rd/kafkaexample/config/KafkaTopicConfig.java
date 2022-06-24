package com.rd.kafkaexample.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * Created at 6/24/22.
 *
 * @author Ridvan Dogan
 */
@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic rdcodeTopic() {
        return TopicBuilder.name("rdcode")
                .build();
    }

}
