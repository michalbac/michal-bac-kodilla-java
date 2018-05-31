package com.kodilla.testing.shape;

public class Circle implements Shape{

    private String shapeName;
    private Double radius;

    public Circle(String shapeName, Double radius) {
        this.shapeName = shapeName;
        this.radius = radius;
    }

    public String getShapeName() {

        return shapeName;
    }

    public Double getField() {

        return Math.PI*Math.pow(radius,2);
    }
}
