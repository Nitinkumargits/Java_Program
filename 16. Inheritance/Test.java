class Circle {
    public double radius;

    public Circle() {
        float radius = 0.0f;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {

        return 2 * Math.PI * radius;
    }

}

class Cyclinder extends Circle {
    public double height;

    public Cyclinder() {
        float height = 0.0f;
    }

    public double volume() {
        return area() * height;
    }
}

/**
 * Test
 */
public class Test {
    public static void main(String[] args) {
        Cyclinder c = new Cyclinder();
        c.radius = 7;
        c.height = 10;
        System.out.println("Volume " + c.volume());
        System.out.println("Area " + c.area());
    }

}