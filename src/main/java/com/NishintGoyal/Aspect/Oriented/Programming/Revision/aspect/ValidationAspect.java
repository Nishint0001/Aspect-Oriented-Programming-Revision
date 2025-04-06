package com.NishintGoyal.Aspect.Oriented.Programming.Revision.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ValidationAspect
{

    @Pointcut("execution(* com.NishintGoyal.Aspect.Oriented.Programming.Revision.services.impl.*.*(..))")
    public void validationChecking()
    {

    }

    @Around("validationChecking()")
    public Object validateOrderId(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        Object args[]=proceedingJoinPoint.getArgs();

        Long orderId=(Long)args[0];

        if(orderId>0)
        {
            return proceedingJoinPoint.proceed();
        }

        return "Cannot call with negative order id";
    }

}
