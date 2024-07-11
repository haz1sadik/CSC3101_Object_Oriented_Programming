package Final_Study.one;

public class Circle9 extends GeometricObject {
    /**
     * Default constructor
     */
    public Circle9() {
        this(1.0);
        System.out.print("C");
        System.out.print("FF");
        System.out.print("GG");
    }

    /**
     * Construct circle with a specified radius
     */
    public Circle9(double radius) {
        this(radius, "white", false);
        System.out.print("D");
    }

    /**
     * Construct a circle with specified radius, filled, and color
     */
    public Circle9(double radius, String color, boolean filled) {
//super(color, filled)// explicitly invoke
        System.out.print("E"); //super() implicitly invoke
    }
}
