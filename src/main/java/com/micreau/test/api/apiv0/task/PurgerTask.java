package com.micreau.test.api.apiv0.task;

import com.micreau.test.api.apiv0.repository.TemperatureRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class PurgerTask {
    private TemperatureRepository repository;

    @Autowired
    public PurgerTask(TemperatureRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void finishedCreatingTask() {
        log.info("created purger task");
    }

    @Scheduled(fixedRate = 60000)
    public void purgeAllData() {
        log.info("puring all data from temperature repository");
        repository.deleteAll();
    }
}
