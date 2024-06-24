package Files.Suha.lab7q2;

public class Triangle extends Shape implements PrintObject{
	
	private double height;
	private double width;
	
	public Triangle(String color, double height, double width) {
		super(color);
		this.height=height;
		this.width=width;
	}
	
	public boolean checkWidthHeight() {
		if (width > 0 && height >0) {
			return true;}
		else {
			return false;
		}
	}
	public double getArea() {
		return 0.5*width*height;
	}
	public double getPerimeter() {
		return width+height;
	}

	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printPerimeter() {
		// TODO Auto-generated method stub
		
	}
	
}

	