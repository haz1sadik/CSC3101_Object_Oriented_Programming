package Lab7_Week10_11.Q2;
import java.util.Scanner;
public class TestProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("======== Circle ========");
        System.out.print("Enter Color : ");
        String colorCircle = input.next();
        System.out.print("Enter Radius : ");
        double radiusCircle = input.nextDouble();
        Circle circle = new Circle(colorCircle, radiusCircle);

        System.out.println("======== Triangle ========");
        System.out.print("Enter Color : ");
        String colorTriangle = input.next();
        System.out.print("Enter Width : ");
        double width = input.nextDouble();
        System.out.print("Enter Height : ");
        double height = input.nextDouble();
        Triangle triangle = new Triangle(colorTriangle, width, height);

        System.out.println("======== Circle ========");
        System.out.print("Enter Color : ");
        String colorReCircle = input.next();
        System.out.print("Enter Radius : ");
        double radiusReCircle = input.nextDouble();
        ResizableCircle reCircle = new ResizableCircle(colorReCircle, radiusReCircle);
        System.out.print("Do You Want to Change the Radius ? [Y/N] : ");
        char change = input.next().charAt(0);
        if (change == 'Y' || change == 'y'){
            System.out.print("Enter Percentage of the Original Radius : ");
            int percent = input.nextInt();
            reCircle.resize(percent);
        }

        System.out.println(triangle.getHeight());
        System.out.println(triangle.getWidth());

        if (circle.checkRadius()){
            System.out.println("\n------- Circle -------");
            System.out.print("Color : " + circle.getColor() + "\nRadius : " + circle.getRadius() + "\nArea : " + circle.printArea() + "\nPerimeter : " + circle.printPerimeter());
        }
        if (triangle.checkWidthAndHeight()){
            System.out.println("\n------- Triangle -------");
            System.out.print("Color : " + triangle.getColor() + "\nWidth :  " + triangle.getWidth() + "\nHeight : " + triangle.getHeight() + "\nArea : " + circle.printArea() + "\nPerimeter : " + circle.printPerimeter());
        }
        if (reCircle.checkRadius()){
            System.out.println("\n------- Resizable Circle -------");
            System.out.print("Color : " + reCircle.getColor() + "\nRadius : " + reCircle.getRadius() + "\nArea : " + reCircle.printArea() + "\nPerimeter : " + reCircle.printPerimeter());
        }
    }
}
