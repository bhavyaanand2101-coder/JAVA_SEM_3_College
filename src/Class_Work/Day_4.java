// make a java code in which we have to take a number from user as a input and return the number of digits
// package Class_Work;

// import java.util.Scanner;

// public class Day_4 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         int count = 0;

//         // Handle 0 separately since 0 has 1 digit
//         if (n == 0) {
//             count = 1;
//         } else {
//             n = Math.abs(n); // handle negative numbers
//             while (n > 0) {
//                 n = n / 10;
//                 count++;
//             }
//         }

//         System.out.println("Number of digits: " + count);

//         sc.close();
//     }
// }
// make a java code in which make a string and reverse it using recursion 
package Class_Work;

import java.util.Scanner;

public class Day_4 {
    static String reverse(String str) {
        // Base condition
        if (str.length() <= 1) {
            return str;
        }

        // Recursion
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = reverse(str);
        System.out.println("Reversed string: " + result);
        sc.close();
    }
}