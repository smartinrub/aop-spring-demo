package org.smartinrub.aopspringdemo;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Aspect
@Configuration
public class MyBeforeAspect {
    
    @Before("execution(* org.smartinrub.aopspringdemo.service.*.*(..))")
    public void beforeSomething(JoinPoint joinPoint) {
        log.info("ASPECT: Running something else before service -> {}", joinPoint);
    }
}
