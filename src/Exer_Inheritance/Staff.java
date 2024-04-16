package Exer_Inheritance;

public class Staff {
    private int staffID;
    private double salary;
    public Staff(){
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public double bonus(){
        return getSalary()*0.1;
    }

    @Override
    public String toString() {
        return "\nStaff ID : " + getStaffID() + "\nSalary : RM" + getSalary() + "\nBonus : RM" + bonus();
    }
}
