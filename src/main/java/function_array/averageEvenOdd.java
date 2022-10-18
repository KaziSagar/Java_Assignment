// 5. Take 5 numbers from users in an array.
// Then find out the average number, how many even and how many odd numbers
// using these functions: average(), countEvenNumbers(), countOddNumbers()

package function_array;

import java.util.Scanner;


class findAverageEvenOdd {
    static double average(int array[], int size){

        double sum = 0;

        for(int i = 0; i < size; i++){
            sum += array[i];
        }
        double avg = sum/size;

        return avg;
    }

    static int even(int array[], int size){

        int count = 0;

        for(int i = 0; i < size; i++){

            if(array[i]%2 == 0)
                count++;
        }
        return count;
    }

    static int odd(int array[], int size){

        int count = 0;

        for(int i = 0; i < size; i++){

            if(array[i]%2 != 0)
                count++;
        }
        return count;
    }

}

class MainMethod {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Enter a number ("+i+"): ");
            arr[i] = input.nextInt();
        }

        double avg = findAverageEvenOdd.average(arr, 5);
        int totalEven = findAverageEvenOdd.even(arr, 5);
        int totalOdd = findAverageEvenOdd.odd(arr, 5);

        System.out.println("\nAverage is = " + avg);
        System.out.println("Total even numbers = " + totalEven);
        System.out.println("Total odd numbers = " + totalOdd);
    }
}