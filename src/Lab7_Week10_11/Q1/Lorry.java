package Lab7_Week10_11.Q1;

public class Lorry extends Transport implements RoadTax{
    private double weightOfGoods;
    public Lorry(String regNo, double value, double weightOfGoods){
        super(regNo, value);
        this.weightOfGoods = weightOfGoods;
    }
    public double getWeightOfGoods(){
        return this.weightOfGoods;
    }
    @Override
    public String toString(){
        return super.toString() + "\nWeight of Goods : " + getWeightOfGoods() + "Kg";
    }

    @Override
    public double getRoadTaxAmount() {
        return (getValue() / 100) + 15 * getWeightOfGoods();
    }
}
