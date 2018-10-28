package org.smartinrub.aopspringdemo.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.smartinrub.aopspringdemo.repository.MyRepositoryTwo;
import org.springframework.stereotype.Service;

@Slf4j
@AllArgsConstructor
@Service
public class MyServiceTwo implements MyService {

    private final MyRepositoryTwo repositoryTwo;

    @Override
    public String getSomething() {
        return repositoryTwo.getSomething();
    }
}
