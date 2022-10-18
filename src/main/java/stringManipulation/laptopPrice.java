// 3. Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?

package stringManipulation;

public class laptopPrice {
    public static void main(String[] args) {
        String str="Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr=(str.split(" "));
        double laptop_price = Double.parseDouble(arr[1]);
        double discount = Double.parseDouble(arr[2]);
        double total = laptop_price - (laptop_price * (discount/100));

        System.out.println("\nTotal price = "+total);
    }
}
