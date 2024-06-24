package Files.Suha.lab7q2;

public class Circle extends Shape implements PrintObject{

	private double radius;
	
	public Circle(String color,double radius) {
		super(color);
		this.radius=radius;
	}
	public boolean checkRadius() {
		if (radius >0) {
			return true;
		}
		else {
			return false;
		}
	}
	 public double getArea() {
	        return Math.PI * radius * radius;
	    }

	    
	    public double getPerimeter() {
	        return 2 * Math.PI * radius;
	    }
	
		public void printArea() {			
		}
		
		public void printPerimeter() {			
		}
	
}
