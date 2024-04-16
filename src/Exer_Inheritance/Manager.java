package Exer_Inheritance;

public class Manager extends Staff {
    private String department;

    public Manager(){

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public double bonus(){
        return getSalary()*0.2;
    }

    @Override
    public String toString() {
        return "Staff ID : " + getStaffID() + "\nSalary : RM" + getSalary() + "\nBonus : RM" + bonus();
    }
}
