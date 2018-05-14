package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calc = new Calculator(8,5);

        int result1 = calc.getA() + calc.getB();
        int result2 = calc.getA() - calc.getB();

        if (result1 == (calc.add())) {
            System.out.println("Adding test: ok");
        } else {
            System.out.println("Adding test: ERROR!!!");
        }

        if (result2 == (calc.subtract())){
            System.out.println("Subtract test: ok");
        } else {
            System.out.println("Subtract test: ERROR!!!");
        }

    }
    }

