package com.NishintGoyal.Aspect.Oriented.Programming.Revision.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect
{
    @Before("execution(* com.NishintGoyal.Aspect.Oriented.Programming.Revision.services.impl.DeliveryServiceImpl.*(..))")
    public void beforeShipmentServiceMethods(JoinPoint joinPoint)
    {
        log.info("Before method call: {}",joinPoint.getSignature());
    }


}
