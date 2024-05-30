package Lab7_Week10_11.Q1;

import java.util.Scanner;

public class TestProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====== Van ======");
        System.out.print("Enter Registration Number : ");
        String regNoVan = input.next();
        System.out.print("Enter Market Value : ");
        double valueVan = input.nextDouble();
        System.out.print("Enter Number of Seats : ");
        int numOfSeatVan = input.nextInt();
        Van van = new Van(regNoVan, valueVan, numOfSeatVan);

        System.out.println("====== Lorry ======");
        System.out.print("Enter Registration Number : ");
        String regNoLorry = input.next();
        System.out.print("Enter Market Value : ");
        double valueLorry = input.nextDouble();
        System.out.print("Enter Weight of Goods : ");
        double weightOfGoodsLorry = input.nextDouble();
        Lorry lorry = new Lorry(regNoLorry, valueLorry, weightOfGoodsLorry);

        System.out.println("\n------- Van -------");
        System.out.println(van);
        System.out.println("Road Tax Amount Van : RM" + van.getRoadTaxAmount());

        System.out.println("------- Lorry -------");
        System.out.println(lorry);
        System.out.println("Road Tax Amount Lorry : RM" + lorry.getRoadTaxAmount());
    }
}
