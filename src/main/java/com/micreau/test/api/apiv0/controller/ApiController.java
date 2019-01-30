package com.micreau.test.api.apiv0.controller;

import com.micreau.test.api.apiv0.datamodel.Temperature;
import com.micreau.test.api.apiv0.repository.TemperatureRepository;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Random;

@RequestMapping("api/")
@RestController
@Slf4j

public class ApiController {
    private TemperatureRepository repository;
    private Random r = new Random();

    public ApiController(TemperatureRepository repository) {
        this.repository = repository;
    }

    @GetMapping("temperature")
    public List<Temperature> getAllTemps() {
        return repository.findAll();
    }

    @PostMapping("temperature")
    public void addTemperature(@RequestParam("sensorid") String sensorId,
                               @RequestParam("temperature") String temperature) {
        Temperature t = new Temperature(r.nextLong(),sensorId, temperature);
        log.info("saving new temperature {}", t);
        repository.save(t);
    }
}
