package Lab3_Week4_5.Q3;

public class SalesPerson extends Employee{
    private double commision;
    public SalesPerson(String name, String address, String email, int phoneNum, String employeeNum, double basicSalary, double commision){
        super(name, address, email, phoneNum, employeeNum, basicSalary);
        setCommision(commision);
    }

    public double getCommision() {
        return commision;
    }

    public void setCommision(double commision) {
        this.commision = commision;
    }

    @Override
    public String toString() {
        return "The Sales Person " +  getName() + " (Employee Number " + getEmployeeNum() + ") has a salary of RM" + getBasicSalary() + "\nHe also has an Commision of RM" +  getCommision();
    }
}
