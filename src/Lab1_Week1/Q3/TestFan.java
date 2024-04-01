package Lab1_Week1.Q3;

public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(fan1.FAST);

        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setOn(true);
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
