package tandemloop;

import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user how many numbers to input
        System.out.print("Enter how many numbers you want to input: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        // Read n numbers into the array
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Count multiples of 1 to 9
        for (int i = 1; i <= 9; i++) {
            int count = 0;

            for (int num : numbers) {
                if (num % i == 0) {
                    count++;
                }
            }

            System.out.println(i + ": " + count);
        }
    }
}
