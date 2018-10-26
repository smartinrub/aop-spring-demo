package org.smartinrub.aopspringdemo.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.smartinrub.aopspringdemo.repository.MyRepositoryOne;
import org.springframework.stereotype.Service;

@Slf4j
@AllArgsConstructor
@Service
public class MyServiceOne implements MyService {

    private final MyRepositoryOne repositoryOne;

    @Override
    public String getSomething() {
        String value = repositoryOne.getSomething();
        return value;
    }
}
