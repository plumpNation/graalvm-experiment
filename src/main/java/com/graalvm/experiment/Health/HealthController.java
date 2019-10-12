package com.graalvm.experiment.Health;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @RequestMapping("/health")
    public Health health() {
        return new Health("Hello world!");
    }
}