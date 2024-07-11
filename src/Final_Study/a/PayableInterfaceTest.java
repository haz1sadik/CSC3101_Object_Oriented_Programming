package Final_Study.a;

public class PayableInterfaceTest {
    public static void main(String[] args) {
        Payable[] payObj = new  Payable[2];
        payObj[0] = new Invoice("01234", 2, 15.00);
        payObj[1] = new SalariedEmployee("John Smith", 450);

        for (Payable curr : payObj){
            System.out.println(curr.toString() + "\npayment due: " + curr.getPaymentAmount());
        }
    }
}
