// 6. Write  a program to find the factorial of a given number

package if_else_loop;

import java.util.Scanner;

public class factorialFinding {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int factorial = num;

        for (int i = num - 1; i > 1; i--) {
            factorial = factorial * i;
        }

        System.out.println("The factorial of " + num + " is: " + factorial);
    }
}