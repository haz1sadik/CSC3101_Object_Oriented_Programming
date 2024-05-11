package Lab4_Week6_7.Q1;

import java.util.ArrayList;

public class TestProgram {
    public static void main(String[] args) {
        //ArrayList Creation and Declaration
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        //Objects Creation
        Van van1 = new Van(12, "Blue", 60, 12000.00);
        Van van2 = new Van(40, "Orange", 30, 40000.00);
        Car car = new Car(2024, 20 , "Red", 120, 98000.00);
        Lorry lorry1 = new Lorry(3000, "Green", 40, 69000.00);
        Lorry lorry2 = new Lorry(2000, "Black", 10, 40000.00);
        vehicles.add(van1);
        vehicles.add(van2);
        vehicles.add(car);
        vehicles.add(lorry1);
        vehicles.add(lorry2);
        //Loop to print all info
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
