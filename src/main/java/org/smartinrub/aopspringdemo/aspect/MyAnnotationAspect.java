package org.smartinrub.aopspringdemo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class MyAnnotationAspect {

    @Around("@annotation(org.smartinrub.aopspringdemo.annotation.TrackTime)")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        log.info("ASPECT - Around: Time before proceed: {}", startTime);
        
        Object proceed = joinPoint.proceed();
        
        long totalTime = System.currentTimeMillis() - startTime;
	    log.info("ASPECT - Around: Time after proceed {}: {}", joinPoint.getSignature(), totalTime);

	    return proceed;
    }
    
}
