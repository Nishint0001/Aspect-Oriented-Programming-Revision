package com.NishintGoyal.Aspect.Oriented.Programming.Revision.services.impl;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class DeliveryServiceImplTest
{
    @Autowired
    private DeliveryServiceImpl deliveryService;

    @Test
    void orderPackage()
    {
        String str=deliveryService.orderPackage(5L);
        log.info(str);
    }

    @Test
    void trackPackage()
    {
        deliveryService.trackPackage(22L);
    }
}