package com.deliveryboy.service;

import com.deliveryboy.constants.KafkaConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final Logger log = LoggerFactory.getLogger(KafkaService.class);

    public boolean updateLocation(String location){

        this.kafkaTemplate.send(KafkaConstants.LOCATION_UPDATE_TOPIC,location);
        log.info("Message Produced");
        return true;
    }
}
