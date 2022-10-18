// 6. Replace "R" from Rahim with "F" from the given String:
//Input: Ratul and Rahim lives in Rangpur
//Output: Ratul and Fahim lives in Rangpur

package stringManipulation;

public class replaceChar {
    public static void main(String[] args) {

        String str = "Ratul and Rahim lives in Rangpur";

        int index = 10;
        char ch = 'F';

        str = str.substring(0, index) + ch + str.substring(index + 1);

        System.out.println(str);
    }
}
