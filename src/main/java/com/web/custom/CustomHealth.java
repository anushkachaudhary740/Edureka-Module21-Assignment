package com.web.custom;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CustomHealth implements HealthIndicator {
    public boolean isHealthGood() {
        return true;
    }

    @Override
    public Health health() {
        if (isHealthGood()) {
            return Health.up().withDetail("Database Service","Database Service is running").build();

        }
        return Health.down().withDetail("Database Service","Database Service is running down").build();
    }
}
