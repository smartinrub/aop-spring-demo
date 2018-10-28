package org.smartinrub.aopspringdemo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class MyBeforeAspect {
    
    @Before("org.smartinrub.aopspringdemo.aspect.JoinPoints.serviceLayer()")
    public void beforeSomething(JoinPoint joinPoint) {
        log.info("ASPECT - Before: {}", joinPoint.getSignature());
    }
}
