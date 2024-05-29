package Lab5_Week7.Q1;

public class TestFood {
    public static void main(String[] args) {
        Food[] foods = new Food[5];
        foods[0] = new Food("Crunchy Peanut", 539.7, 32.22);
        foods[1] = new Food("Muruku", 111.0, 7.0);
        foods[2] = new Food("Roasted Chicken", 211.0, 7.00);
        foods[3] = new Food("Roti Canai", 644.0, 83.0);
        foods[4] = new Food("Test Exception", 0, 90);

        for (Food food : foods) {
            System.out.println(food);
        }

    }
}
