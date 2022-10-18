// 4. Write a program to check balance and withdraw money from ATM booth using if else or switch case

package if_else_loop;

import java.util.Scanner;

public class checkOrWithdraw {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nPress '0' to Check Balance\nPress '1' to Withdraw Money\n");
        int caseVariable = input.nextInt();

        switch (caseVariable){
            case 0: System.out.println("\nBalance is being checked!");
            break;

            case 1: System.out.println("\nMoney is being withdrawn!");
            break;

            default: System.out.println("\nPlease select valid option!");
            break;
        }
    }
}
