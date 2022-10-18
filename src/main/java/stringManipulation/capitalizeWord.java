// 8. Write a program to convert each 1st char to uppercase from a string
//Input: rahim lives in sylhet
//Output: Rahim Lives in Sylhet

package stringManipulation;

public class capitalizeWord {
    public static void main(String[] args) {
        String str = "rahim lives in sylhet";
        String words[] = str.split(" ");
        for(int i=0; i< words.length; i++){
            String firstLetter = String.valueOf(words[i].charAt(0));
            String restletter = words[i].substring(1);
            System.out.println(firstLetter.toUpperCase()+""+restletter);
        }
    }
}