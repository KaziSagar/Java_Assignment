// 2. Price of a formal shirt is 1200 tk and Saree is 3500 tk.
// If you buy 2 shirt and 1 saree, then 400 tk will be discounted.
// After your purchase what will be your total cost?

package stringManipulation;

public class shirtAndSaree {
    public static void main(String[] args) {
        String str="Price of a formal shirt is 1200 tk and Saree is 3500 tk. If you buy 2 shirt and 1 saree, then 400 tk will be discounted. After your purchase what will be your total cost?";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr=(str.split(" "));
        double shirt_price = Double.parseDouble(arr[0]);
        double saree_price = Double.parseDouble(arr[1]);
        int shirtCount = Integer.parseInt(arr[2]);
        int sareeCount = Integer.parseInt(arr[3]);
        double discount = Double.parseDouble(arr[4]);
        double total = ((shirt_price * shirtCount) + (saree_price * sareeCount)) - discount;

        System.out.println("\nTotal price = "+total);
    }
}
