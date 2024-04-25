package Lab4_Week6_7.Q1;

public class Van extends Vehicle{
    private int length;
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
        if (length > 15)
            return super.SalePrice() * 0.975;
        else
            return super.SalePrice() * 0.95;
    }
    @Override
    public String toString() {
        return "\nVan\n" + "Length : " + getLength() + "\nColor : " + getColor() + "\nSpeed : " + getSpeed() + "\nRegular Price : " + getRegularPrice() + "\nPrice After Discount : " + SalePrice();
    }

}
