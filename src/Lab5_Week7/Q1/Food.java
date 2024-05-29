package Lab5_Week7.Q1;

public class Food {
    private String givenFood;
    private double totalCalories, fatGram, calcPercentage;

    public Food(String givenFood, double totalCalories, double fatGram) {
        setGivenFood(givenFood);
        setTotalCalories(totalCalories);
        setFatGram(fatGram);
    }

    public void setGivenFood(String givenFood) {
        this.givenFood = givenFood;
    }

    public void setFatGram(double fatGram) {
        this.fatGram = fatGram;
    }

    public void setTotalCalories(double totalCalories) {
        this.totalCalories = totalCalories;
    }

    public String getGivenFood() {
        return this.givenFood;
    }

    public double getFatGram() {
        return fatGram;
    }

    public double getTotalCalories() {
        return totalCalories;
    }

    public double calcCalFromFat() {
        return getFatGram() * 9;
    }

    public void calcPercentage() {
        try {
            if (getTotalCalories() == 0) {
                throw new ArithmeticException();
            }
            double j = calcCalFromFat() / getTotalCalories();
            this.calcPercentage = j * 100;
        } catch (ArithmeticException ae) {
            System.out.print("\nError when calculating percentage: total calories cannot be zero.");
            this.calcPercentage = 0;
        }
    }

    @Override
    public String toString() {
        calcPercentage();
            if (calcPercentage < 30 && calcPercentage != 0) {
                return "\n" + this.givenFood + " Have a Total Calorie of " + this.totalCalories + " with " + this.fatGram + "g of fat\nPercentage of Calories From Fat is : " + calcPercentage + "%" + "\n" + getGivenFood() + " is low fat";
            }
            else if(calcPercentage >= 30){
                return "\n" + this.givenFood + " Have a Total Calorie of " + this.totalCalories + " with " + this.fatGram + "g of fat\nPercentage of Calories From Fat is : " + calcPercentage + "%";
            }
            else {
                return " ";
            }
    }
}