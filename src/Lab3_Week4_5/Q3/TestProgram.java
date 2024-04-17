package Lab3_Week4_5.Q3;

public class TestProgram {
    public static void main(String[] args) {
        Person manager1 = new Manager("Ahmad Abu", " ", " ", 0, "A11981", 6300.00, 1300.00);
        Person salesPerson = new SalesPerson("Nur Fatimah Rahman", " ", " ", 0, "S02063", 2500.00, 1200.00);

        System.out.println(manager1);
        System.out.println("\n" + salesPerson);
    }
}
