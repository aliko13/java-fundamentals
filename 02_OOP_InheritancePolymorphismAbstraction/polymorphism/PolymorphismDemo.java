public class PolymorphismDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice");
        Employee e2 = new Developer("Bob");

        e1.work(); // base
        e2.work(); // polymorphic

        if (e2 instanceof Developer) {
            ((Developer) e2).debug(); // Type checking + casting
        }
    }
}
