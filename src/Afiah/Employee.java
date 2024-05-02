package Afiah;

public class Employee extends Person{
    private String office;
    private double salary;
    private MyDate dateHired;
    public Employee(){
        super();
    }
    public Employee(String office, double salary, MyDate dateHired, String name, String address, String email, int phoneNumber){
        super(name, address, email, phoneNumber);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return  super.toString() + "\nOffice : " + getOffice() + "\nSalary : " + getSalary() + "\nDate Hired : " + getDateHired();
    }
}
