package Final_Study.a;

public class SalariedEmployee extends Employee{
    private double weeklySalary;
    public SalariedEmployee(String name, double weeklySalary){
        super(name);
        this.weeklySalary = weeklySalary;
    }
    public double getPaymentAmount(){
        return weeklySalary;
    }

    @Override
    public String toString() {
        return "\nsalary employee: " + super.toString() + "\nweekly salary: " + getPaymentAmount();
    }
}
