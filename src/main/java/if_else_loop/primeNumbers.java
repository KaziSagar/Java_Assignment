// Write a program to print prime numbers from 2 to n

package if_else_loop;

import java.util.Scanner;

public class primeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int count;

        System.out.println("The prime numbers from 2 to n are:");

        for (int i = 2; i <= n; i++) {

            count = 0;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0)
                    count++;
            }

            if (count == 0)
                System.out.println(i);
        }
    }
}
