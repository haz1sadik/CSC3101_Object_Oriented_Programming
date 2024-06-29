package Lab9_Week14.Q2;

import java.util.ArrayList;

public class removeDuplicatesTest {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(4);
        integers.add(5);
        ArrayList<Integer> duplicateRemoved= removeDuplicates(integers);
        System.out.println("New List : " + duplicateRemoved);
    }
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        ArrayList<E> newList = new ArrayList<>();
        for (E element : list){
            if (!newList.contains(element)){
                newList.add(element);
            }
        }
        return newList;
    }
}
