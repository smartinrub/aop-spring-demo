package org.smartinrub.aopspringdemo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Aspect
@Configuration
public class MyBeforeAspect {
    
    @Before("org.smartinrub.aopspringdemo.aspect.JoinPoints.serviceLayer()")
    public void beforeSomething(JoinPoint joinPoint) {
        log.info("ASPECT: Running something else before service -> {}", joinPoint);
    }
}
