package com.deliveryboy.controller;

import com.deliveryboy.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class KafkaController {

    @Autowired
    private KafkaService kafkaService;

    @GetMapping("/location/update")
    public ResponseEntity<?> updateLocation() {

        this.kafkaService.updateLocation("( " + Math.random() + ", " + Math.random()+" )");
        return new ResponseEntity<>(Map.of("message","Location Updated"), HttpStatus.OK);
    }
}
