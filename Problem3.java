package tandemloop;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        int total;

        if (a % 2 == 0) {
            total = a - 1;
        } else {
            total = a;
        }

        int number = 1;

        for (int i = 1; i <= total; i++) {
            System.out.print(number);

            if (i < total) {
                System.out.print(", ");
            }

            number = number + 2;
        }
    }
}
