package org.smartinrub.aopspringdemo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class MyAfterThrowingAspect {


    @AfterThrowing(
            value = "org.smartinrub.aopspringdemo.aspect.JoinPoints.controllerLayer()",
            throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint, IllegalArgumentException ex) {
        log.info("ASPECT - After Throwing: exception \"{}\" on controller \"{}\"", ex, joinPoint.getSignature());
    }
}
