package org.smartinrub.aopspringdemo;

import org.smartinrub.aopspringdemo.service.MyServiceTwo;
import org.smartinrub.aopspringdemo.service.MyServiceOne;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Slf4j
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ApplicationTest {
    
    @Autowired
    private MyServiceOne serviceOne;
    
    @Autowired
    private MyServiceTwo serviceTwo;
    
    @Test
    public void runServices() {
        Assertions.assertEquals("Repo one", serviceOne.getSomething());
        Assertions.assertEquals("Repo two", serviceTwo.getSomething());

    }
    
}
