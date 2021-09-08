package com.example.quickwindemo.C03;

import org.apache.commons.lang3.RandomStringUtils;

import javax.persistence.*;
import java.util.Random;
import java.util.SplittableRandom;

@Entity
@Table(name = "c03_entity")
public class C03Entity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name = RandomStringUtils.randomAlphanumeric(0);

    public String getName() {
        return name;
    }
}
