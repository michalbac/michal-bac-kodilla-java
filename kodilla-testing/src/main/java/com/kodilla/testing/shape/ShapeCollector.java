package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapes = new ArrayList<Shape>();


    public void addFigure (Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure (Shape shape) {
        shapes.remove(shape);
    }

    public  Shape getFigure (int n){

        return shapes.get(n);
    }

    public ArrayList<Shape> showFigures(){

        return shapes;

    }
}
