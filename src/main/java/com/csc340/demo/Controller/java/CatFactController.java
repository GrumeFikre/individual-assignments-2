package com.csc340.demo.Controller.java;

import com.csc340.demo.model.CatFact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class CatFactController {

    private final String API_URL = "https://catfact.ninja/fact";

    @GetMapping("/catfact")
    public CatFact getCatFact() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(API_URL, CatFact.class);
    }
}
