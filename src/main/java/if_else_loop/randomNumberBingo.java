// 8. Write a program to generate 2 random numbers which will not be shown to the user.
//        Take a user input and match it with any of the random numbers.
//        If correct give it 1 point and if incorrect, do not give it any point.
//        Finally, repeat this for 10 times and count the point user achieved.

package if_else_loop;

import java.util.Scanner;

public class randomNumberBingo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userGuess, point = 0;

        for(int i=0; i<10; i++){
            double first = Math.random();
            int firstRandom = (int) Math.floor(first*100);
            double second = Math.random();
            int secondRandom = (int) Math.floor(second*100);

            //un-comment the below lines to test the program

            //System.out.println("\n" + firstRandom);
            //System.out.println("\n" + secondRandom);

            System.out.println("Enter your guessed number ("+i+"): ");
            userGuess = input.nextInt();

            if(userGuess == firstRandom || userGuess == secondRandom)
                point++;
        }
        System.out.println("\nYour achieved points: " + point);
    }
}