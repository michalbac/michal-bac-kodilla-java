package com.kodilla.testing.shape;

public class Triangle {

    String shapeName;
    Integer field;

    public Triangle(String shapeName, Integer field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    public String getShapeName() {
        return shapeName;
    }

    public int getField() {
        return field;
    }
}