public class Person {
    private String name;
    private int age;
    private Address address; // Composition (has-a relationship)

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", " + age + " years old.");
        if (address != null) {
            System.out.println("I live at " + address.getFullAddress());
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }
}
