package org.smartinrub.aopspringdemo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class MyAfterAspect {

    @After(value = "org.smartinrub.aopspringdemo.aspect.JoinPoints.repositoryLayer(id)")
    public void afterSomething(JoinPoint joinPoint, int id) {
        log.info("ASPECT - After: {}", joinPoint.getSignature());
    }

    @AfterReturning(
            value = "org.smartinrub.aopspringdemo.aspect.JoinPoints.repositoryLayer(id)",
            returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result, int id) {
        log.info("ASPECT - After Returning: repository {} with id {} returned {}", joinPoint, id, result);
    }
}
