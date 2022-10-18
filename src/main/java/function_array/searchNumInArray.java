// 1. Take input from a user and check if the number exists in the array
//let the array is [1,3,5,7,2,4,6,8]
//Input: 7
//Output: Found in the position 3
//Input: 9
//Output: No element found!
package function_array;

import java.util.Scanner;

public class searchNumInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {1, 3, 5, 7, 2, 4, 6, 8};
        int flag = 0;

        System.out.println("Enter the number to be searched: ");
        int n = input.nextInt();

        for(int i = 0; i < arr.length; i++){
            if(n == arr[i]){
                flag = 1;
                System.out.println("Found at position: " + i);
            }
        }
        if(flag==0)
            System.out.println("No element found!");
    }
}