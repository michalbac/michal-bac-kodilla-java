package com.kodilla.testing.shape;

public class Square implements Shape{

    private String shapeName;
    private Double side;

    public Square(String shapeName, Double side) {
        this.shapeName = shapeName;
        this.side = side;
    }

    public String getShapeName() {
        return shapeName;
    }

    public Double getField() {
        return Math.pow(side, 2);
    }
}
