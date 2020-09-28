package com.bguneser.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {


    @Before("execution(* com.bguneser.aop.service.MessageService.giveMessage(..))")
    //JoinPoint o anki state'i taşıyor
    //Uzun işlem sürmeyen kontroller burda yapılabilinir. Örneğin yetki kontrolü
    public void beforeGiveMessageMethod(JoinPoint joinPoint){

        System.out.println("Before give method parameter is catched, param :"+joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());

    }

    @After("execution(* com.bguneser.aop.service.*.*(..))")
    //Loglama gibi işlemler burda yapılır
    public void afterGiveMessageMethod(JoinPoint joinPoint){

        System.out.println("After give method parameter is catched, param : "+joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());



    }
}
