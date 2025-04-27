package su.publisher.service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaUserSimulationProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String ADD_TOPIC = "topic-test";
    private final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

    @PostConstruct
    public void startSimulation() {
        scheduler.scheduleAtFixedRate(this::sendTestMessage, 0, 10, TimeUnit.SECONDS);
    }

    private void sendTestMessage() {
        try {
            String message = "test";
            kafkaTemplate.send(ADD_TOPIC, message);
            log.info("🟢 Отправлено сообщение в топик '{}': {}", ADD_TOPIC, message);
        } catch (Exception e) {
            log.error("Ошибка при отправке сообщения в топик {}", ADD_TOPIC, e);
        }
    }
}
