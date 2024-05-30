package Lab7_Week10_11.Q1;

public class Van extends Transport implements RoadTax{
    private int noOfSeat;
    public Van(String regNo, double value, int noOfSeat){
        super(regNo, value);
        this.noOfSeat = noOfSeat;
    }
    public int getNoOfSeat(){
        return this.noOfSeat;
    }
    @Override
    public String toString(){
        return super.toString() + "\nNumber of Seats : " + getNoOfSeat();
    }

    @Override
    public double getRoadTaxAmount() {
        return (getValue() / 10) + 105 * getNoOfSeat();
    }
}
