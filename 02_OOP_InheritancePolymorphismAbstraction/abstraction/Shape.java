public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double area(); // Abstract method

    public void describe() {
        System.out.println("This is a " + color + " shape.");
    }
}
