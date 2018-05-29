package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    String shapeName;
    Integer field;

    public ShapeCollector(String shapeName, Integer field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    ArrayList<ShapeCollector> shapes = new ArrayList<ShapeCollector>();


    public void addFigure (Shape shape) {
        //do nothing
    }

    public void removeFigure (Shape shape) {
        //do nothing
    }

    public  void getFigure (int n){
        //do nothing
    }

    public void showFigures(){
        //do nothing
    }
}
