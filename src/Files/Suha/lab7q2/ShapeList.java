package Files.Suha.lab7q2;
import java.util.Scanner;
public class ShapeList {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Shape [] shape = new Shape[30];
		double[] area= new double [30];
		double[] perimeter= new double [30];
		
		for (int i = 0 ; i< shape.length; i++) {
			System.out.println("--------Enter details for shape " + (i + 1) + "--------");
			System.out.println("Enter shape type(Circle/Triangle): ");
			String shapeType = sc.nextLine();
			System.out.println("Enter color: ");
			String color = sc.nextLine();

			if (shapeType.equalsIgnoreCase("Circle")) {
				System.out.println("Enter radius: ");
				double radius = sc.nextDouble();
				shape[i] = new Circle(color, radius);
				Circle circle = (Circle) shape[i];
				area[i] = shape[i].getArea();
				perimeter[i] = shape[i].getPerimeter();
				circle.printArea();
				circle.printPerimeter();
				sc.nextLine();

				System.out.println("Do you want to resize the circle(y/n): ");
				char resize = sc.next().charAt(0);

				if (resize == 'y') {
					ResizableCircle resizableCircle = new ResizableCircle(color, radius);
					System.out.println("How many percent you want to resize? : ");
					double percent = sc.nextDouble();
					sc.nextLine();
					resizableCircle.resize(percent);
					shape[i] = resizableCircle;
					area[i] = shape[i].getArea();
					perimeter[i] = shape[i].getPerimeter();
					System.out.println("New Area of  Resizable Circle : " + String.format("%.2f", area[i]));
					System.out.println("New Perimeter of Resizable Circle : " + String.format("%.2f", perimeter[i]));

				}


			} else if (shapeType.equalsIgnoreCase("Triangle")) {
				System.out.println("Enter width: ");
				double width = sc.nextDouble();
				System.out.println("Enter height: ");
				double height = sc.nextDouble();
				shape[i] = new Triangle(color, width, height);
				area[i] = shape[i].getArea();
				perimeter[i] = shape[i].getPerimeter();
				Triangle triangle = (Triangle) shape[i];
				triangle.printArea();
				triangle.printPerimeter();

			}
			sc.nextLine();

			// Find shapes with the largest and smallest area and perimeter
			Shape largestAreaShape = shape[0];
			Shape smallestAreaShape = shape[0];
			Shape largestPerimeterShape = shape[0];
			Shape smallestPerimeterShape = shape[0];

			for (Shape shape1 : shape) {
				if (shape1 != null) {
					if (shape1.getArea() > largestAreaShape.getArea()) {
						largestAreaShape = shape1;
					}
					if (shape1.getArea() < smallestAreaShape.getArea()) {
						smallestAreaShape = shape1;
					}
					if (shape1.getPerimeter() > largestPerimeterShape.getPerimeter()) {
						largestPerimeterShape = shape1;
					}
					if (shape1.getPerimeter() < smallestPerimeterShape.getPerimeter()) {
						smallestPerimeterShape = shape1;
					}
				}
			}
			// Print the shapes with the largest and smallest area and perimeter
			System.out.println("Shape with the largest area: " + largestAreaShape);
			System.out.println("Shape with the smallest area: " + smallestAreaShape);
			System.out.println("Shape with the largest perimeter: " + largestPerimeterShape);
			System.out.println("Shape with the smallest perimeter: " + smallestPerimeterShape);
		}
	}
}
