// 2. Input an amount from the user and find out the number of notes from input amount in given array
//[1000,500,100,50,20,10,5,2,1]
//Input: 1256
//Output:
//1000 1
//200 1
//50 1
//5 1
//1 1

package function_array;

import java.util.Scanner;

public class numOfNotes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter the amount:\n");
        int amount = input.nextInt();

        int n1000, n500, n200, n100, n50, n20, n10, n5, n2, n1;

        System.out.println("\nCombination of notes:\n");

        if(amount >= 1000)
        {
            n1000 = amount/1000;
            amount -= n1000 * 1000;
            System.out.println("1000 TK note = " + n1000);
        }
        if(amount >= 500)
        {
            n500 = amount/500;
            amount -= n500 * 500;
            System.out.println("500 TK note = " + n500);
        }
        if(amount >= 200)
        {
            n200 = amount/200;
            amount -= n200 * 200;
            System.out.println("200 TK note = " + n200);
        }
        if(amount >= 100)
        {
            n100 = amount/100;
            amount -= n100 * 100;
            System.out.println("100 TK note = " + n100);
        }
        if(amount >= 50)
        {
            n50 = amount/50;
            amount -= n50 * 50;
            System.out.println("50 TK note = " + n50);
        }
        if(amount >= 20)
        {
            n20 = amount/20;
            amount -= n20 * 20;
            System.out.println("20 TK note = " + n20);
        }
        if(amount >= 10)
        {
            n10 = amount/10;
            amount -= n10 * 10;
            System.out.println("10 TK note = " + n10);
        }
        if(amount >= 5)
        {
            n5 = amount/5;
            amount -= n5 * 5;
            System.out.println("5 TK note = " + n5);
        }
        if(amount >= 2)
        {
            n2 = amount /2;
            amount -= n2 * 2;
            System.out.println("2 TK note = " + n2);
        }
        if(amount >= 1)
        {
            n1 = amount;
            System.out.println("1 TK note = " + n1);
        }

    }
}
