// 3. Input 2 decimal numbers and check if they are both same or different up to two decimal places. E.g 120.546 & 120.241

package if_else_loop;

import java.util.Scanner;

public class equalDecimal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        if (Math.abs(num1 - num2) <= 0.01)
            System.out.println("The numbers are the same.");
        else
            System.out.println("The numbers are different.");
    }
}
