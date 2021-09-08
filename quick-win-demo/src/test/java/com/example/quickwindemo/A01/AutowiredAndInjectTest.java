package com.example.quickwindemo.A01;

import com.example.quickwindemo.A01.MainService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.inject.Inject;

@SpringBootTest(classes = {MainService.class, SubService.class})
class AutowiredAndInjectTest {

    @Autowired
    private MainService mainService;

    @Test
    void testAnnotations() {

        mainService.logMessage();
    }
}
