package Lab4_Week6_7.Q2;
//TwoDimensional is a child class from superclass Shape
public class TwoDimensional extends Shape{
    //attributes declarations
    private int numOfSides;
    public TwoDimensional(int numOfSides, String color){
        super(color);
        setNumOfSides(numOfSides);
    }
    //Getters and Setters
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
