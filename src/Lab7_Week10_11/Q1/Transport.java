package Lab7_Week10_11.Q1;

public abstract class Transport {
    private String regNo;
    private double value;

    public Transport(String regNo, double value){
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
