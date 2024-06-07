/*
 * Name : MUHAMMAD HAZUAN BIN SADIK
 * Matric Number : 223877
 */
package Lab7_Week10_11.Q1;
//Abstract class
public abstract class Transport {
    //Attributions declaration
    private String regNo;
    private double value;

    public Transport(String regNo, double value){ //Constructor
        this.regNo = regNo;
        this.value = value;
    }
    public String getRegNo(){
        return this.regNo;
    }
    public double getValue(){
        return this.value;
    }
    public double valueAfterDiscount(){
        return getValue() - (getValue() * 0.25);
    }
    @Override
    public String toString(){
        return "Registration Number : " + getRegNo() + "\nMarket Value : " + getValue();
    }
}
