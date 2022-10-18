// 1. Write a program to sum of user input until users input ‘q’ from keyboard

package if_else_loop;

import java.util.Scanner;

public class sumOfnUserInputs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sum = 0;
        char ch;

        do{
            System.out.print("Enter a number: ");
            sum += input.nextDouble();
            System.out.print("Press 'any key' to continue OR Press 'q' to quit: ");
            ch = input.next().charAt(0);
        }while(ch != 'q');
        System.out.print("Sum = " + sum);
    }
}
