package com.NishintGoyal.Aspect.Oriented.Programming.Revision.services.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DeliveryServiceImplTest
{
    @Autowired
    private DeliveryServiceImpl deliveryService;

    @Test
    void orderPackage()
    {
        deliveryService.orderPackage(5L);
    }

    @Test
    void trackPackage()
    {
        deliveryService.trackPackage(22L);
    }
}