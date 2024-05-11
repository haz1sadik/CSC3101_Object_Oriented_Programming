package Lab4_Week6_7.Q2;
//ThreeDimensional is a child class from superclass Shape
public class ThreeDimensional extends Shape{
    //attributes declarations
    private int numOfSurface;
    public ThreeDimensional(int numOfSurface, String color){
        super(color);
        setNumOfSurface(numOfSurface);
    }

    //Getters and Setters
    public int getNumOfSurface() {
        return numOfSurface;
    }

    public void setNumOfSurface(int numOfSurface) {
        this.numOfSurface = numOfSurface;
    }
    public double calcArea(){
        return 0.0;
    }
    public double calcVolume(){
        return 0.0;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumber of Surface : " + getNumOfSurface();
    }
}
