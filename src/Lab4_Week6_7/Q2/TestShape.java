package Lab4_Week6_7.Q2;

import java.util.ArrayList;

public class TestShape {
    public static void main(String[] args) {
        //ArrayList creation and declaration
        ArrayList<Shape> shapes= new ArrayList<>();
        //object creation
        Circle circle = new Circle(2, 1, "Blue");
        Triangle triangle = new Triangle(2,2, 3, "Red");
        Square square = new Square(3,4, "Green");
        Cube cube = new Cube(4, 6, "Orange");
        Sphere sphere = new Sphere(2, 1, "Yellow");
        shapes.add(circle);
        shapes.add(triangle);
        shapes.add(square);
        shapes.add(cube);
        shapes.add(sphere);
        //Loop to print all the info
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
