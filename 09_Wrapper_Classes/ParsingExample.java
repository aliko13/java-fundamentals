public class ParsingExample {
    public static void main(String[] args) {
        String strInt = "100";
        String strDouble = "99.99";
        String strBoolean = "true";

        int parsedInt = Integer.parseInt(strInt);
        double parsedDouble = Double.parseDouble(strDouble);
        boolean parsedBool = Boolean.parseBoolean(strBoolean);

        System.out.println("Parsed int: " + parsedInt);
        System.out.println("Parsed double: " + parsedDouble);
        System.out.println("Parsed boolean: " + parsedBool);
    }
}
