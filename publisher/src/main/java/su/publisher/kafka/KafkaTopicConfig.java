package su.publisher.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic uploadFileToContract() {
        return TopicBuilder.name("topic-test")
                .partitions(1)
                .replicas(1)
                .build();
    }
}
