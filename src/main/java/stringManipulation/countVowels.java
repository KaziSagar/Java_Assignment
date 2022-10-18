// 5. Write a program that will count how many vowels in the given string:
//"roadtosdet"
//Output: 4

package stringManipulation;

public class countVowels {
    public static void main(String[] args) {
        String str = "roadtosdet";
        int size = str.length();
        int count = 0;

        for(int i=0; i<size;i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                count++;
        }
        System.out.println("\nNumber of vowels = " + count);
    }
}
