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


    @AfterThrowing("org.smartinrub.aopspringdemo.aspect.JoinPoints.controllerLayer()")
    public void afterThrowing(JoinPoint joinPoint) {
        log.info("ASPECT: Running something after exception on controller -> {}", joinPoint.getSignature());
    }
}
