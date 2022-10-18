// 10. Write a program to enter the numbers till the user wants and at the end, the program should display the largest and smallest numbers user entered.

package if_else_loop;

import java.util.Arrays;
import java.util.Scanner;

public class largestAndSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nHow many values do you wanna insert?");
        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.println("Insert Value (" + i +"): ");
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Max = " + arr[n-1] + " and Min = " + arr[0]);
    }
}