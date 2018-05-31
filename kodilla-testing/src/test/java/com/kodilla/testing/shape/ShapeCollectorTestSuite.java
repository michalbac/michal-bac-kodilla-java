package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests (){
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void afterEveryTest() {
        System.out.println("Test #" + testCounter + " completed");

    }


    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        ArrayList<Shape> shapes = new ArrayList <Shape>();
        Circle circle = new Circle("Circle", 20.0);
        Square square = new Square("Square", 10.0);
        Triangle triangle = new Triangle("Triangle", 5.0, 10.0);

        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);


        //Then
        Assert.assertEquals(3, shapeCollector.shapes.size());
    }

    @Test
    public void testRemoveFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        ArrayList<Shape> shapes = new ArrayList <Shape>();
        Circle circle = new Circle("Circle", 20.0);
        Square square = new Square("Square", 10.0);
        Triangle triangle = new Triangle("Triangle", 5.0, 10.0);

        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.removeFigure(circle);
        shapeCollector.removeFigure(triangle);


        //Then
        Assert.assertEquals(1, shapeCollector.shapes.size());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        ArrayList<Shape> shapes = new ArrayList <Shape>();
        Circle circle = new Circle("Circle", 20.0);
        Square square = new Square("Square", 10.0);
        Triangle triangle = new Triangle("Triangle", 5.0, 10.0);

        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);


        //Then
        Assert.assertEquals(triangle, shapeCollector.getFigure(2));
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        ArrayList<Shape> shapes = new ArrayList <Shape>();
        Circle circle = new Circle("Circle", 20.0);
        Square square = new Square("Square", 10.0);
        Triangle triangle = new Triangle("Triangle", 5.0, 10.0);

        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);


        //Then
        Assert.assertEquals(shapeCollector.shapes, shapeCollector.showFigures());

    }

    @Test
    public void testGetShapeName() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        ArrayList<Shape> shapes = new ArrayList <Shape>();

        //When
        Circle circle = new Circle("Circle", 20.0);
        Square square = new Square("Square", 10.0);
        Triangle triangle = new Triangle("Triangle", 5.0, 10.0);

        //Then
        Assert.assertEquals("Circle", circle.getShapeName());
        Assert.assertEquals("Square", square.getShapeName());
        Assert.assertEquals("Triangle", triangle.getShapeName());
    }

    @Test
    public void testGetField() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            ArrayList<Shape> shapes = new ArrayList <Shape>();

            //When
            Circle circle = new Circle("Circle", 20.0);
            Square square = new Square("Square", 10.0);
            Triangle triangle = new Triangle("Triangle", 5.0, 10.0);

            //Then
            Assert.assertEquals(1256.0, circle.getField(), 1.5);
            Assert.assertEquals(100, square.getField(), 0.5);
            Assert.assertEquals(25, triangle.getField(), 0.5);
        }
    }
