package Lab3_Week4_5.Q3;

public class Manager extends Employee{
    private double allowance;

    public Manager(String name, String address, String email, int phoneNum, String employeeNum, double basicSalary, double allowance){
        super(name, address, email, phoneNum, employeeNum, basicSalary);
        setAllowance(allowance);
    }

    public void setAllowance(double allowance){
        this.allowance = allowance;
    }
    public double getAllowance(){
        return this.allowance;
    }

    @Override
    public String toString() {
        return "The Manager " +  getName() + " (Employee Number " + getEmployeeNum() + ") has a salary of RM" + getBasicSalary() + "\nHe also has an allowance of RM" +  getAllowance();
    }
}
