package Lab4_Week6_7.Q2;

public class TwoDimensional extends Shape{
    private int numOfSides;
    public TwoDimensional(int numOfSides, String color){
        super(color);
        setNumOfSides(numOfSides);
    }

    public int getNumOfSides() {
        return numOfSides;
    }

    public void setNumOfSides(int numOfSides) {
        this.numOfSides = numOfSides;
    }
    public double calcArea(){
        return 0.0;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumber of Sides : " + getNumOfSides();
    }
}
