package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";

    public final Task makeTaks(final String taskType){
        switch (taskType) {
            case SHOPPING:
                return new ShoppingTask("Shopping task 1", "milk", 1.0);
            case DRIVING:
                return new DrivingTask("Driving task 1", "shop", "car");
            case PAINTING:
                return new PaintingTask("Painting task 1", "blue", "wall");
            default:
                    return null;
        }
    }

}
