package Files.Suha.lab7q2;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(String color, double radius) {
        super(color, radius);
    }

    @Override
    public double resize(double percent) {
        double newRadius = getRadius() * (1 + percent / 100);
        setRadius(newRadius);
        return newRadius;
    }

	private void setRadius(double newRadius) {
	}

	private double getRadius() {
		return 0;
	}
}
