import java.util.Optional;

public class OptionalMapFlatMapExample {
    public static void main(String[] args) {
        Address address = new Address("Hamburg");
        User userWithAddress = new User(Optional.of(address));
        User userWithoutAddress = new User(Optional.empty());

        // map example
        String city1 = userWithAddress.getAddress()
                .map(Address::getCity)
                .orElse("City Not Found");

        String city2 = userWithoutAddress.getAddress()
                .map(Address::getCity)
                .orElse("City Not Found");

        System.out.println("User 1 city: " + city1);
        System.out.println("User 2 city: " + city2);
    }

    static class Address {
        private String city;
        public Address(String city) { this.city = city; }
        public String getCity() { return city; }
    }

    static class User {
        private Optional<Address> address;
        public User(Optional<Address> address) { this.address = address; }
        public Optional<Address> getAddress() { return address; }
    }
}
