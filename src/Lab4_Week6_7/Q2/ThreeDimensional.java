package Lab4_Week6_7.Q2;

public class ThreeDimensional extends Shape{
    private int numOfSurface;
    public ThreeDimensional(int numOfSurface, String color){
        super(color);
        setNumOfSurface(numOfSurface);
    }

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
