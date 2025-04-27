package su.listener.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaUserSimulationListener {
    @KafkaListener(topics = "topic-test", groupId = "group-test")
    public void listenAddUserTopic(String message) {
        log.info("🟡 Получено сообщение из топика 'topic-test': {}", message);
    }
}
