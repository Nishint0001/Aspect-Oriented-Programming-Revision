package com.NishintGoyal.Aspect.Oriented.Programming.Revision.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
//@Aspect
@Slf4j
public class LoggingAspect
{
    @Before("execution(* com.NishintGoyal.Aspect.Oriented.Programming.Revision.services.impl.DeliveryServiceImpl.*(..))")
    public void beforeShipmentServiceMethods(JoinPoint joinPoint)
    {
        log.info("Before method call: {}",joinPoint.getSignature());
    }

    @Before("within(com.NishintGoyal.Aspect.Oriented.Programming.Revision..*)")
    public void beforeServiceImplCalls()
    {
        log.info("Service Impl calls ");
    }

    @Before("pointCutMethod()")
    public void b()
    {
        log.info("Before Nishint Logging calls");
    }

    @Pointcut("@annotation(com.NishintGoyal.Aspect.Oriented.Programming.Revision.aspect.NishintLogging)")
    public void pointCutMethod()
    {

    }
}
