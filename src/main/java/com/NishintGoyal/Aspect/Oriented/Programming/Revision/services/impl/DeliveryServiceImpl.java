package com.NishintGoyal.Aspect.Oriented.Programming.Revision.services.impl;

import com.NishintGoyal.Aspect.Oriented.Programming.Revision.aspect.NishintLogging;
import com.NishintGoyal.Aspect.Oriented.Programming.Revision.services.DeliveryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class DeliveryServiceImpl implements DeliveryService
{
    @Override
    @NishintLogging
    public String orderPackage(Long orderId)
    {
       // log.info("Order Package is called"); without AOP

        try
        {
            log.info("Processng the order ...");
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            log.error("Error occurred while processing the order",e);
        }

        return "Order has been processed successfully,orderId: "+orderId;
    }

    @Override
    @Transactional
    public String trackPackage(Long orderId)
    {
        // log.info("Track  Package is called"); without AOP
        try
        {
            log.info("Tracking the order...");
            Thread.sleep(500);
            throw new RuntimeException("Exception occurred during trackPackage");
        }
        catch(InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}
