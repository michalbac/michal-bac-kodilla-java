package com.kodilla.calculator;

public class Sum {
    int a;
    int b;

    public Sum (int a, int b) {
        this.a = a;
        this.b = b;

    }

    int sumresult () {
        return ( getA() + getB() );
    }

    int subresult () {
        return (getA() - getB() );
    }

    public int getA (){
        return this.a;

    }

    public int getB() {
        return this.b;
    }
}

