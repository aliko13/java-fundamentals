public class Dog extends Animal {

    public Dog(String name) {
        super(name); // Constructor chaining
        System.out.println("Dog constructor called");
    }

    public void bark() {
        System.out.println(name + " says: Woof!");
    }
}
