package Lab9_Week14.Q3;

import java.util.Scanner;

public class MinMaxTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 10;
        System.out.println("Enter 10 integers");
        Integer[] list = new Integer[num];
        for (int i = 0; i < num; i++){
            System.out.print("Integer " + (i+1) + " : ");
            list[i] = input.nextInt();
        }
        Integer max = Max(list);
        Integer min = Min(list);

        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
    public static <E extends Comparable<E>> E Max(E[] list){
        E max = list[0];
        for (E element : list){
            if (element.compareTo(max) > 0){
                max = element;
            }
        }
        return max;
    }
    public static <E extends Comparable<E>> E Min(E[] list){
        E min = list[0];
        for (E element : list){
            if (element.compareTo(min) < 0){
                min = element;
            }
        }
        return min;
    }
}

