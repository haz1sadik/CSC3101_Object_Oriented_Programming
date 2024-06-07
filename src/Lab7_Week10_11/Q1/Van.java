/*
 * Name : MUHAMMAD HAZUAN BIN SADIK
 * Matric Number : 223877
 */
package Lab7_Week10_11.Q1;

public class Van extends Transport implements RoadTax{

    //Attributions declaration
    private int noOfSeat;
    public Van(String regNo, double value, int noOfSeat){ //Constructor
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
