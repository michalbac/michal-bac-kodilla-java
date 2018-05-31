package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String shapeName;
    private Double lenght;
    private Double height;

    public Triangle(String shapeName, Double lenght, Double height) {
        this.shapeName = shapeName;
        this.lenght = lenght;
        this.height = height;
    }

    public String getShapeName() {
        return shapeName;
    }

    public Double getField() {
        return lenght * height * 0.5;
    }
}