// 7. Generate 20 random numbers from 0 to 100 and print the max, min and duplicate random numbers (if any)

package function_array;

import java.util.Arrays;

public class minMaxDuplicate {

    public static void duplicate(int[] arrOfRandomNumbers) {
        int flag = 0;
        for (int i = 0; i < arrOfRandomNumbers.length; i++) {
            for (int j = i + 1; j < arrOfRandomNumbers.length; j++) {
                if (arrOfRandomNumbers[i] == arrOfRandomNumbers[j]) {
                    flag = 1;
                    System.out.println("Duplicate: " + arrOfRandomNumbers[i]);
                }
            }
        }
        if (flag == 0)
            System.out.println("There are no duplicate values!");
    }

    public static void main(String[] args) {

        int[] arrOfRandomNumbers = new int[20];

        for(int i=0; i<20; i++){
            double first = Math.random();
            int generatedRandomNumber = (int) Math.floor(first*100);
            arrOfRandomNumbers[i] = generatedRandomNumber;
        }

        Arrays.sort(arrOfRandomNumbers);

        System.out.println("\nMax = " + arrOfRandomNumbers[19]);
        System.out.println("Min = " + arrOfRandomNumbers[0]);
        duplicate(arrOfRandomNumbers);
    }
}
