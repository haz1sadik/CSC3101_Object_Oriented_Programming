package Afiah;

import java.util.ArrayList;
import java.util.Scanner;

public class TestProgram2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Staff> staff= new ArrayList<>();
        MyDate hired = new MyDate(29,4, 2019);
        MyDate hired2 = new MyDate(23,5, 2008);
        MyDate hired3 = new MyDate(1,9, 2020);
        staff.add(new Staff(1234, "Supervisor", "UPM", 12000.00, hired, "Amir", "Subang", "amir@upm.com", 1234));
        staff.add(new Staff(5630, "Manager", "Celcom", 19000.00, hired2, "Alen", "Sarawak", "alen@upm.com", 4567));
        staff.add(new Staff(9862, "Parttime", "Maxis", 30000.00, hired3, "Wan", "Kuang", "wan@upm.com", 9876));
        System.out.print("Enter staff id : ");
        int staffID = input.nextInt();
        int staffLocation = 123;
        boolean found = false;
        for (int i = 0; i < staff.size(); i++){
            Staff staffs = staff.get(i);
            if (staffs.equals(new Staff(staffID))){
                found = true;
                staffLocation = i;
                break;
            }
        }
        if (found){
            System.out.println("Staff found : ");
            System.out.println(staff.get(staffLocation));
        }
        else {
            System.out.println("Staff with ID " + staffID + " not found");
        }
    }
}
