package tandemloop;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        int oddNumber = 1;

        for (int i = 1; i <= a; i++) {
            System.out.print(oddNumber);
            if (i < a) {
                System.out.print(", ");
            }
            oddNumber = oddNumber + 2;
        }
    }
}

