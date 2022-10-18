// 2. Write a program to calculate GPA and find grade

package if_else_loop;

import java.util.Scanner;

public class gpaGradeCalculation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to NSU Grading System!\n\nPlease enter your GPA: ");
        double gpa = input.nextDouble();

        if(gpa > 4 || gpa < 0)
            System.out.println("Please enter a valid GPA!");
        else if (gpa == 4.00)
            System.out.println("Your grade is: A (Excellent!)");
        else if (gpa >= 3.70)
            System.out.println("Your grade is: A-");
        else if (gpa >= 3.33)
            System.out.println("Your grade is: B+");
        else if (gpa >= 3.00)
            System.out.println("Your grade is: B (Good!)");
        else if (gpa >= 2.70)
            System.out.println("Your grade is: B-");
        else if (gpa >= 2.30)
            System.out.println("Your grade is: C+");
        else if (gpa >= 2.0)
            System.out.println("Your grade is: C (Average!)");
        else if (gpa >= 1.70)
            System.out.println("Your grade is: C-");
        else if (gpa >= 1.30)
            System.out.println("Your grade is: D+");
        else if (gpa >= 1.00)
            System.out.println("Your grade is: D (Poor!)");
        else if(gpa >= 0.0)
            System.out.println("Your grade is: F (Failure!)");
        else
            System.out.println("Please enter a valid GPA!");
    }
}
