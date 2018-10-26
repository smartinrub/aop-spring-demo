package org.smartinrub.aopspringdemo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Aspect
@Configuration
public class MyAnnotationAspect {
    
    @Around("@annotation(org.smartinrub.aopspringdemo.annotation.TrackTime)")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        
        joinPoint.proceed();
        
        long timeTaken = System.currentTimeMillis() - startTime;
	log.info("ASPECT: Time Taken by {} is {}", joinPoint, timeTaken);
    }
    
}
