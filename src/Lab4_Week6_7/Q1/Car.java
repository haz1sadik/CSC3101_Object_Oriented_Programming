package Lab4_Week6_7.Q1;

public class Car extends Vehicle{
    private int year, manufacturerDiscount;
    public Car(int year, int manufacturerDiscount, String color, int speed, double regularPrice){
        super(color, speed, regularPrice);
        setYear(year);
        setManufacturerDiscount(manufacturerDiscount);
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getManufacturerDiscount() {
        return manufacturerDiscount;
    }

    public void setManufacturerDiscount(int manufacturerDiscount) {
        this.manufacturerDiscount = manufacturerDiscount;
    }
    @Override
    public double SalePrice(){
        return super.SalePrice() * (1.0 - (getManufacturerDiscount() / 100.0));
    }
    @Override
    public String toString() {
        return "\nCar\n" + "Year : " + getYear() + "\nColor : " + getColor() + "\nSpeed : " + getSpeed() + "\nRegular Price : " + getRegularPrice() + "\nPrice After Discount : " + SalePrice();
    }
}
