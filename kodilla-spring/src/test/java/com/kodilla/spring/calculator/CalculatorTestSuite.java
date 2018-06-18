package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(5, 7.5);
        double sub = calculator.sub(10.2, 2.1);
        double mul = calculator.mul(4, 2.5);
        double div = calculator.div(18, 4.5);

        //Then
        Assert.assertEquals(12.5, add, 0.1);
        Assert.assertEquals(8.1, sub, 0.1);
        Assert.assertEquals(10, mul, 0.1);
        Assert.assertEquals(4, div, 0.1);
    }
}
