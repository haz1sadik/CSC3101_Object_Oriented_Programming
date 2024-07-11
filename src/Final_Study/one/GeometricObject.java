package Final_Study.one;

public abstract class GeometricObject {
    protected GeometricObject() {
        this("red", false);
        System.out.print("A");
        System.out.print("FF");
        System.out.print("GG");
    }

    protected GeometricObject(String color, boolean filled) {
        System.out.print("B");
        System.out.print("FF");
        System.out.print("GG");
    }
}
