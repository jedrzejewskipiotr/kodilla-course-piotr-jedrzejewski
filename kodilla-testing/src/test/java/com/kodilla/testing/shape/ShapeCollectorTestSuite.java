package com.kodilla.testing.shape;

import org.junit.*;

import java.util.List;

public class ShapeCollectorTestSuite {

    Shape circle = new Circle();
    Shape square = new Square();
    Shape triangle = new Triangle();

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is beginning of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("Tests are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test # " + testCounter);
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(circle);

        //Then
        List <Shape> result = shapeCollector.showFigures();
        Assert.assertTrue(result.size()==1);

    }
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);

        //When
        shapeCollector.removeFigure(circle);

        //Then
        List<Shape> result = shapeCollector.showFigures();
        Assert.assertEquals(0, result.size());
    }
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        //When
        Shape shape = shapeCollector.getFigure(1);

        //Then
        Assert.assertEquals(shape, square);
    }
    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        //When
        List<Shape> shapes = shapeCollector.showFigures();

        //Then
        Assert.assertTrue(shapes.size() == 3);
    }
}
