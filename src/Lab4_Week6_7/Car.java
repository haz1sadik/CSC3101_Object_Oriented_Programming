package Lab4_Week6_7;

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
}
