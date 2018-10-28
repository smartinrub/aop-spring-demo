package org.smartinrub.aopspringdemo.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class JoinPoints {
    
    @Pointcut("execution(* org.smartinrub.aopspringdemo.service.*.*(..))")
    public void serviceLayer(){}
    
    @Pointcut("execution(* org.smartinrub.aopspringdemo.repository.*.*(..))")
    public void repositoryLayer(){}

    @Pointcut("execution(* org.smartinrub.aopspringdemo.controller.*.*(..))")
    public void controllerLayer(){}
}
