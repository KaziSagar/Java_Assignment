// 6. Suppose a software system excepts valid credentials from user to logged in to the system.
// if the user inputs wrong password for 3 times,
// system will say that "Your user has been temporary locked".
// Let the username: admin, password: admin@123

package function_array;

import java.util.Scanner;

public class loginSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username = "admin";
        String password = "admin@123";

        int i;

        System.out.println("\nEnter username: ");
        String strUsername = input.nextLine();

        for(i=0; i<3; i++){
            System.out.println("Enter password: ");
            String strPass= input.nextLine();

            if(strPass.equals(password)){
                System.out.println("\nSuccessfully logged in!");

                break;
            }
            else{
                if (i == 2)
                    System.out.println("\nToo many invalid login attempts!");
                else
                    System.out.println("\nIncorrect Password! Please enter correct password!");
            }
        }

        if (i == 3)
            System.out.println("Your user has been temporary locked!");
    }
}