package org.smartinrub.aopspringdemo.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.smartinrub.aopspringdemo.repository.MyRepositoryOne;
import org.springframework.stereotype.Service;
import org.smartinrub.aopspringdemo.annotation.TrackTime;

@Slf4j
@AllArgsConstructor
@Service
public class MyServiceOne implements MyService {

    private final MyRepositoryOne repositoryOne;

    @TrackTime
    @Override
    public String getSomething(int id) {
        return repositoryOne.getSomething(id);
    }
}
