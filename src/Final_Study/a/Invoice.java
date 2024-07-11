package Final_Study.a;

public class Invoice implements Payable {
    private  String partNo;
    private  int quant;
    private double price;

    public Invoice(String partNo, int quant, double price) {
        this.partNo = partNo;
        this.quant = quant;
        this.price = price;
    }
    public double getPaymentAmount(){
        return  quant * price;
    }

    @Override
    public String toString() {
        return  "part number: " + partNo;
    }
}
