package org.smartinrub.aopspringdemo.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.smartinrub.aopspringdemo.service.MyServiceOne;
import org.smartinrub.aopspringdemo.service.MyServiceTwo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
public class MyAopController {
    
    private final MyServiceOne serviceOne;
    
    private final MyServiceTwo serviceTwo;

    @GetMapping("/api/one/{id}")
    public String getOne(@PathVariable("id") int id) {

        if (id == 0) {
            throw new IllegalArgumentException("id value can't be 0");
        }
        return serviceOne.getSomething(id);
    }
    
    @GetMapping("/api/two/{id}")
    public String getTwo(@PathVariable("id") int id) {
        return serviceTwo.getSomething(id);
    }
}
