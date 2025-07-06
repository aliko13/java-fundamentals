public class StringUtilityExample {
    public static void main(String[] args) {
        String fullName = "  Ali Huseynov  ";
        String city = "hamburg";

        // Trim and transform
        String trimmed = fullName.trim();
        String upper = city.toUpperCase();
        String lower = city.toLowerCase();

        // Check prefix/suffix
        boolean starts = trimmed.startsWith("Ali");
        boolean ends = trimmed.endsWith("ov");

        // Replace & substring
        String replaced = trimmed.replace("Ali", "Elvin");
        String sub = trimmed.substring(0, 3);

        // Split and join
        String[] parts = trimmed.split(" ");
        String joined = String.join("-", parts);

        // StringBuilder usage
        StringBuilder builder = new StringBuilder();
        builder.append("Welcome ").append(trimmed).append("!");
        String built = builder.toString();

        System.out.println("Original: '" + fullName + "'");
        System.out.println("Trimmed: '" + trimmed + "'");
        System.out.println("Upper: " + upper + ", Lower: " + lower);
        System.out.println("Starts with 'Ali': " + starts);
        System.out.println("Ends with 'ov': " + ends);
        System.out.println("Replaced: " + replaced);
        System.out.println("Substring: " + sub);
        System.out.println("Split: " + String.join(", ", parts));
        System.out.println("Joined: " + joined);
        System.out.println("StringBuilder: " + built);
    }
}
