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

    @AfterReturning(
            value = "org.smartinrub.aopspringdemo.aspect.JoinPoints.repositoryLayer()",
            returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        log.info("ASPECT: Repository {} returned {}", joinPoint, result);
    }

    @After("org.smartinrub.aopspringdemo.aspect.JoinPoints.repositoryLayer()")
    public void afterSomething(JoinPoint joinPoint) {
        log.info("ASPECT: Running something else after repository -> {}", joinPoint.getSignature());
    }
}
