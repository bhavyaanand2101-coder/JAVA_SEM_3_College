package Class_Work;

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

    // Divide (The Main Entry Point)
    public static void main(String[] args) {
        // 1. Call the other methods first
        main111(args); // Runs Add
        main1(args); // Runs Subtract
        main11(args); // Runs Multiply

        // 2. Run the division logic
        int num5 = 44;
        int num6 = 12;
        int div = num5 / num6;
        System.out.println("The division is: " + div);
    }
}
