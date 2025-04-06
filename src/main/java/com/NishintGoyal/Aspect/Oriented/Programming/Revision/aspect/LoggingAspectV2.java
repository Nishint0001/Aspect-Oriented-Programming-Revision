package com.NishintGoyal.Aspect.Oriented.Programming.Revision.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect
@Component
@Slf4j
public class LoggingAspectV2
{
    @Before("allServiceImplMethodsPointCut()")
    public void beforeServiceImplMethodCalls(JoinPoint joinPoint)
    {
        log.info("Before advice method call from LoggingAspectV2, {}",joinPoint.getSignature());
    }

    @AfterThrowing("allServiceImplMethodsPointCut()")
    public void afterServiceMethodCallsThrows(JoinPoint joinPoint)
    {
        log.info("After throwing called",joinPoint.getSignature());
    }


    @Pointcut("execution(* com.NishintGoyal.Aspect.Oriented.Programming.Revision.services.impl.*.*(..))")
    public void allServiceImplMethodsPointCut()
    {

    }

}
