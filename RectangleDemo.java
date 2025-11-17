public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(7.5, 3);

        System.out.println("Area of Rectangle 1: " + r1.calculateArea());
        System.out.println("Area of Rectangle 2: " + r2.calculateArea());
    }
}
