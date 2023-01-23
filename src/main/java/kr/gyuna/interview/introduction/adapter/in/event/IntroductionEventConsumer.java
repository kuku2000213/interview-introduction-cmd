package kr.gyuna.interview.introduction.adapter.in.event;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import kr.gyuna.interview.introduction.event.user.application.service.EnterpriseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@RequiredArgsConstructor
@Slf4j
@Component
public class IntroductionEventConsumer {

//    @Value("${kafka.topics.user-info}")
//    private String topic;

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final EnterpriseService enterpriseService;

    @KafkaListener(topics = "${kafka.topics.user-status}", groupId = "${kafka.consumer.group-id}")
    void listen(String message) throws JsonProcessingException {
        log.info("Consumer.listen: " + message);
        NewUserEvent event = objectMapper.readValue(message, NewUserEvent.class);

        if(event.isEnterprise()){
            enterpriseService.createEnterprise(event.toEnterprise());
        }
    }
}
