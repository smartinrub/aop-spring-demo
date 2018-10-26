package org.smartinrub.aopspringdemo.controller;

import lombok.AllArgsConstructor;
import org.smartinrub.aopspringdemo.service.MyServiceOne;
import org.smartinrub.aopspringdemo.service.MyServiceTwo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class MyAopController {
    
    private final MyServiceOne serviceOne;
    
    private final MyServiceTwo serviceTwo;

    @GetMapping("/api/one")
    public String getOne() {
        return serviceOne.getSomething();
    }
    
    @GetMapping("/api/two")
    public String getTwo() {
        return serviceTwo.getSomething();
    }
}
