package Class_Work;

import java.util.Scanner;

public class Day_5 {
    public static void main(String[] args) {
        Day_5 solver = new Day_5();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert string to character array
        char[] s = input.toCharArray();

        solver.reverseString(s);

        // Convert character array back to string for output
        System.out.println("Reversed: " + new String(s));

        scanner.close();
    }

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
