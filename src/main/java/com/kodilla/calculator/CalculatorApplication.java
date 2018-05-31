package com.kodilla.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
        Sum sum1 = new Sum (4,5);
        Integer result1 = sum1.sumresult();
        System.out.println(result1);
        Sum sub1 = new Sum(10,7);
        Integer subresult1 = sub1.subresult();
        System.out.println(subresult1);
    }
}

