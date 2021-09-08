package com.example.quickwindemo.A01;

import org.junit.jupiter.api.Test;

public class OnlyUnitTest {

    @Test
    void testWithoutSpring() {
        SubService subService = new SubService();
        MainService mainService = new MainService(subService);

        mainService.logMessage();
    }
}
