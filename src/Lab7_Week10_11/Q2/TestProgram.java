package Lab7_Week10_11.Q2;
import java.util.Scanner;
public class TestProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfShapes = 3;
        char[] shapeType = new char[numberOfShapes];
        Shape[] shapes = new Shape[numberOfShapes];
        for(int i = 0; i < shapes.length; i++){
            System.out.print("\nShape " + (i+1) + "\nEnter C for circle, T for triangle and R for resizable circle : ");
            shapeType[i] = input.next().charAt(0);
            if (shapeType[i] == 'C' || shapeType[i] == 'c'){
                System.out.println("======== Circle ========");
                System.out.print("Enter Color : ");
                String colorCircle = input.next();
                System.out.print("Enter Radius : ");
                double radiusCircle = input.nextDouble();
                shapes[i] = new Circle(colorCircle, radiusCircle);
            }else if (shapeType[i] == 'T' || shapeType[i] == 't'){
                System.out.println("======== Triangle ========");
                System.out.print("Enter Color : ");
                String colorTriangle = input.next();
                System.out.print("Enter Width : ");
                double width = input.nextDouble();
                System.out.print("Enter Height : ");
                double height = input.nextDouble();
                shapes[i] = new Triangle(colorTriangle, width, height);
            } else if (shapeType[i] == 'R' || shapeType[i] == 'r') {
                System.out.println("======== Resizable Circle ========");
                System.out.print("Enter Color : ");
                String colorReCircle = input.next();
                System.out.print("Enter Radius : ");
                double radiusReCircle = input.nextDouble();
                shapes[i] = new ResizableCircle(colorReCircle, radiusReCircle);
                ResizableCircle rCircle = (ResizableCircle) shapes[i];
                System.out.print("Do You Want to Change the Radius ? [Y/N] : ");
                char change = input.next().charAt(0);
                if (change == 'Y' || change == 'y'){
                    System.out.print("Enter Percentage of the Original Radius : ");
                    int percent = input.nextInt();
                    rCircle.resize(percent);
                }
            }else {
                System.out.print("Invalid Input Choice. Please Try Again");
                i--;
            }
        }
        for (int i = 0; i < shapes.length; i++){
            if (shapeType[i] == 'C' || shapeType[i] == 'c'){
                Circle circle = (Circle) shapes[i];
                System.out.println("\n------- Circle -------");
                System.out.print("Color : " + circle.getColor() + "\nRadius : " + circle.getRadius() + "\nArea : " + circle.printArea() + "\nPerimeter : " + circle.printPerimeter());
            }else if (shapeType[i] == 'T' || shapeType[i] == 't'){
                Triangle triangle = (Triangle) shapes[i];
                System.out.println("\n------- Triangle -------");
                System.out.print("Color : " + triangle.getColor() + "\nWidth :  " + triangle.getWidth() + "\nHeight : " + triangle.getHeight() + "\nArea : " + triangle.printArea() + "\nPerimeter : " + triangle.printPerimeter());
            }else if (shapeType[i] == 'R' || shapeType[i] == 'r') {
                ResizableCircle rCircle = (ResizableCircle) shapes[i];
                System.out.println("\n------- Resizable Circle -------");
                System.out.print("Color : " + rCircle.getColor() + "\nRadius : " + rCircle.getRadius() + "\nArea : " + rCircle.printArea() + "\nPerimeter : " + rCircle.printPerimeter());
            }
        }
    }
}
