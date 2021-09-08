package com.example.quickwindemo.A03.sub1;

import com.example.quickwindemo.A04.LuckyNumberGenerator;
import org.springframework.stereotype.Service;

@Service
public class A03_Sub1 implements LuckyNumberGenerator {

    public A03_Sub1() {
        System.out.println("sub1");
    }

    @Override
    public int getMyNumber() {
        return 27;
    }
}
