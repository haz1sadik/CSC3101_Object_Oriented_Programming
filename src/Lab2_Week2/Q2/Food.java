package Lab2_Week2.Q2;
import java.lang.Math;

public class Food {
    private String givenFood;
    private double totalCalories, fatGram;

    public Food(){
        this.givenFood = "";
        this.fatGram = 0.0;
        this.totalCalories = 0.0;
    }
    public Food(String givenFood, double totalCalories, double fatGram) {
        setGivenFood(givenFood);
        setTotalCalories(totalCalories);
        setFatGram(fatGram);
    }
    public void setGivenFood(String givenFood){
        this.givenFood = givenFood;
    }
    public void setFatGram(double fatGram) {
        this.fatGram = fatGram;
    }
    public void setTotalCalories(double totalCalories) {
        this.totalCalories = totalCalories;
    }
    public String getGivenFood(){
        return this.givenFood;
    }
    public double getFatGram() {
        return fatGram;
    }
    public double getTotalCalories() {
        return totalCalories;
    }
    public double calcCalFromFat(){
        return getFatGram() * 9;
    }
    public double calcPercentage(){
            return (calcCalFromFat() / this.totalCalories) * 100;
    }
    public boolean checkValid(){
        return calcCalFromFat() < getTotalCalories();
    }

    @Override
    public String toString() {
        if (checkValid())
            if (calcPercentage() < 30) {
                return "\n" + this.givenFood + " Have a Total Calorie of " + this.totalCalories + " with " + this.fatGram + "g of fat\nPercentage of Calories From Fat is : " + Math.round(calcPercentage() * 100.0) / 100.0 + "%" + "\n" + getGivenFood() + " is low fat";
            }
            else {
                return "\n" + this.givenFood + " Have a Total Calorie of " + this.totalCalories + " with " + this.fatGram + "g of fat\nPercentage of Calories From Fat is : " + Math.round(calcPercentage() * 100.0) / 100.0 + "%";
            }
        else
            return "\nInput is Invalid";
    }
}
