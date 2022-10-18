// 1. Write a program to check if inputted letter is small or capital

package if_else_loop;

import java.util.Scanner;

public class letterCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a character: ");
        char letter = input.next().charAt(0);

        if(letter >= 65 && letter <= 90)
            System.out.println("Capital letter");
        else if (letter >= 97 && letter <= 122)
            System.out.println("Small letter");
        else
            System.out.println("Invalid insertion! Try again...");
    }
}
