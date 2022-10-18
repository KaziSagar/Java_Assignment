// 10. Write a program to enter the numbers till the user wants and at the end, the program should display the largest and smallest numbers user entered.

package if_else_loop;

import java.util.Scanner;

public class largestAndSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0, min = 0, n;
        char ch;

        do{
            System.out.print("Enter a number: ");
            n = input.nextInt();

            if(n>max)
                max = n;
            if(n<min)
                min = n;

            System.out.print("Press 'any key' to continue OR Press 'q' to quit: ");
            ch = input.next().charAt(0);

        }while(ch != 'q');
        System.out.print("\nMax = " + max + " and Min = " + min);
    }
}