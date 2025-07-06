import java.util.Arrays;

public class ArraysUtilityExample {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 8, 1, 9};

        // Sorting
        Arrays.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));

        // Searching (must be sorted)
        int index = Arrays.binarySearch(numbers, 8);
        System.out.println("Index of 8: " + index);

        // Fill
        int[] filled = new int[5];
        Arrays.fill(filled, 7);
        System.out.println("Filled array: " + Arrays.toString(filled));
    }
}
