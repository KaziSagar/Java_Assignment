// 4. Create your today's bazar list/pocket expenditure which includes the item name and price.
// Then create a function named searchItem(String item) which will be used to search any item from your HashMap and return the price.
// If found no item, then print message as "No item found" and another function named totalSum() which will return total price of items.

package function_array;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class itemPrice {
    public static HashMap mapping(){
        HashMap hashMap = new HashMap();

        hashMap.put("potato", 60);
        hashMap.put("onion", 90);
        hashMap.put("rice", 40);
        hashMap.put("chips", 15);
        hashMap.put("salt", 25);
        return hashMap;
    }

    public static int searchItem(String item) {

        HashMap hashMap = mapping();

        if(hashMap.get(item) == null){
            return 0;
        }
        else
            return (int) hashMap.get(item);
    }

    public static void totalSum(){
        HashMap hashMap = mapping();
        Collection<Integer> values = hashMap.values();
        int sum = values.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total Price = " + sum);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String itemName;
        String newLine;
        char toQuit;

        do{
            System.out.println("\nEnter item name: ");
            itemName = input.nextLine().toLowerCase();
            //itemName.toLowerCase();

            int itemPrice = searchItem(itemName);

            if(itemPrice == 0)
                System.out.println("No item found!");
            else
                System.out.println("Price of " + itemName + " = " + itemPrice);

            System.out.println("Enter 'q' to quit or any other key to continue: ");
            toQuit = input.next().charAt(0);
            newLine = input.nextLine();

        }while(toQuit != 'q');
        totalSum();
    }
}
