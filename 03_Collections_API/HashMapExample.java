import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> countryCodes = new HashMap<>();

        countryCodes.put("DE", "Germany");
        countryCodes.put("AZ", "Azerbaijan");
        countryCodes.put("IE", "Ireland");
        countryCodes.put("AZ", "Azərbaycan"); // Overwrites previous value

        System.out.println("HashMap (key-value pairs):");
        for (Map.Entry<String, String> entry : countryCodes.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("Code for AZ: " + countryCodes.get("AZ"));
    }
}
