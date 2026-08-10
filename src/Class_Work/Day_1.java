package Class_Work;

// 1. Imports must always be at the very top of the file
import java.util.Arrays;
import java.util.Collections;

public record Day_1() {

    // Add
    public static void main111(String[] args) {
        int number1 = 10;
        int number2 = 20;
        int sum = number1 + number2;
        System.out.println("The sum is: " + sum);
    }

    // Subtract
    public static void main1(String[] args) {
        int num3 = 44;
        int num4 = 12;
        int sub = num3 - num4;
        System.out.println("The subtraction is: " + sub);
    }

    // Multiply
    public static void main11(String[] args) {
        int num3 = 44;
        int num4 = 12;
        int mul = num3 * num4;
        System.out.println("The multiplication is: " + mul);
    }

    // Method to sort an array in Ascending Order
    public static void sortAscending(int[] array) {
        Arrays.sort(array);
    }

    // Method to sort an array in Descending Order (Uses Integer objects)
    public static void sortDescending(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
    }

    // Divide (The Main Entry Point)
    public static void main(String[] args) {
        main111(args);
        main1(args);
        main11(args);

        int num5 = 44;
        int num6 = 12;
        int div = num5 / num6;
        System.out.println("The division is: " + div);
        System.out.println("-----------------------------------"); // Separator Line

        // --- Execution of Sorting Methods ---

        // 1. Execution of Ascending Sort
        int[] primitiveNumbers = { 5, 2, 9, 1, 3 };
        System.out.println("Original Array: " + Arrays.toString(primitiveNumbers));
        sortAscending(primitiveNumbers);
        System.out.println("Ascending Order: " + Arrays.toString(primitiveNumbers));

        System.out.println(); // Space Line

        // 2. Execution of Descending Sort
        Integer[] objectNumbers = { 5, 2, 9, 1, 3 };
        System.out.println("Original Object Array: " + Arrays.toString(objectNumbers));
        sortDescending(objectNumbers);
        System.out.println("Descending Order: " + Arrays.toString(objectNumbers));
    }
}
