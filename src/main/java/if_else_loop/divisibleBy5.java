//5. Write a program to sum of numbers which only divisible by 5 from 1 to 100

package if_else_loop;

public class divisibleBy5 {
    public static void main(String[] args) {

        int sum = 0;

        for(int i = 1; i<=100; i++){
            if(i%5 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("\nThe sum of the numbers which are only divisible by 5 is: "+ sum);
    }
}