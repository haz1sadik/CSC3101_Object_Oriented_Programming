package Lab4_Week6_7;

public class Van extends Vehicle{
    private int length;
    public Van(int length){
        super(" ", 0, 0.0);
    }
    public Van(int length, String color, int speed, double regularPrice){
        super(color, speed, regularPrice);
        setLength(length);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double SalePrice() {
        if (length > 15){
            return getRegularPrice() * 0.975;
        }
        else {
            return getRegularPrice() * 0.95;
        }
    }
}
