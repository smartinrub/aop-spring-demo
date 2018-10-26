package org.smartinrub.aopspringdemo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Aspect
@Configuration
public class MyAfterAspect {

    @AfterReturning(
            value = "execution(* org.smartinrub.aopspringdemo.repository.*.*(..))",
            returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        log.info("ASPECT: Repository {} returned {}", joinPoint, result);
    }

    @After("execution(* org.smartinrub.aopspringdemo.repository.*.*(..))")
    public void afterSomething(JoinPoint joinPoint) {
        log.info("ASPECT: Running something else after repository -> {}", joinPoint);
    }
}
