// 4. Writea program that will give following output:
//Input: chattogram
//Output: C8M

package stringManipulation;

import java.util.Scanner;

public class ChangeOutput {
    public static void main(String[] args) {
        String str ="chattogram";
        String s1 = String.valueOf(str.charAt(0)).toUpperCase();
        String s2 = String.valueOf(str.charAt(str.length()-1)).toUpperCase();
        int len = str.length()-2;
        System.out.println(s1 + len + s2);
    }
}
