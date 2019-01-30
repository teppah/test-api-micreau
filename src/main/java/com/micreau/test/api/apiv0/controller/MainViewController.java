package com.micreau.test.api.apiv0.controller;

import com.micreau.test.api.apiv0.datamodel.Temperature;
import com.micreau.test.api.apiv0.repository.TemperatureRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@Slf4j
public class MainViewController {
    private TemperatureRepository repository;

    @Autowired
    public MainViewController(TemperatureRepository repository) {
        this.repository = repository;
    }

    @GetMapping("home")
    public String home(Model model) {
        List<Temperature> temps = repository.findAll();
        model.addAttribute("temps", temps);
        log.info("returning home view with model {}", model);
        return "home";
    }
}
