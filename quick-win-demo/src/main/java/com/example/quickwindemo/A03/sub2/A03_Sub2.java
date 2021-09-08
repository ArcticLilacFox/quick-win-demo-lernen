package com.example.quickwindemo.A03.sub2;

import com.example.quickwindemo.A04.LuckyNumberGenerator;
import org.springframework.stereotype.Component;

@Component
public class A03_Sub2 implements LuckyNumberGenerator {

    public A03_Sub2() {
        System.out.println("sub2");
    }

    @Override
    public int getMyNumber() {
        return 53;
    }
}
