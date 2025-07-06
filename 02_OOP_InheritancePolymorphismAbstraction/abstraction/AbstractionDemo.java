public class AbstractionDemo {
    public static void main(String[] args) {
        Shape circle = new Circle("red", 5);
        circle.describe();
        System.out.println("Area: " + circle.area());
    }
}
