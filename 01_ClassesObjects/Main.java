public class Main {
    public static void main(String[] args) {
        Address address = new Address("Hamburg", "Hafenstraße 10");
        Person person = new Person("Ali Huseynov", 32, address);

        person.introduce();
    }
}
