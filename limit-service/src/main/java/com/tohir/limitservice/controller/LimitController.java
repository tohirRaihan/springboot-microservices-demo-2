package com.tohir.limitservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tohir.limitservice.bean.Limits;
import com.tohir.limitservice.config.LimitConfiguration;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class LimitController {

    private final LimitConfiguration limitConfiguration;
    
    @GetMapping("/limits")
    public Limits retriveLimits() {
        return new Limits(limitConfiguration.getMinimum(), limitConfiguration.getMaximum());
    }
}
