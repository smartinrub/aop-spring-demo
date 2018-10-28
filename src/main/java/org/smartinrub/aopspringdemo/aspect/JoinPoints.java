package org.smartinrub.aopspringdemo.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class JoinPoints {
    
    @Pointcut("execution(* org.smartinrub.aopspringdemo.service.*.*(..))")
    public void serviceLayer(){}
    
    @Pointcut(
            value = "execution(* org.smartinrub.aopspringdemo.repository.*.*(..)) && args(id)",
            argNames = "id")
    public void repositoryLayer(int id){}

    @Pointcut("execution(* org.smartinrub.aopspringdemo.controller.*.*(..))")
    public void controllerLayer(){}
}
