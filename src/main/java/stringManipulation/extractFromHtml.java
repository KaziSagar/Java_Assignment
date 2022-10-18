// 1. Extract the transaction ID from the HTML body
//<html>
//<title>Test</title>
//<body>
//Your trnx is successful. Trnx Id is: TXN123456
//</body>
//</html>
//Output: TXN123456

package stringManipulation;

public class extractFromHtml {
    public static void main(String[] args) {
        String str="<html>\n" +
                "<title>Test</title>\n" +
                "<body>\n" +
                "Your trnx is successful. Trnx Id is: TXN123456\n" +
                "</body>\n" +
                "</html>";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr=(str.split(" "));

        int TXN = Integer.parseInt(arr[0]);
        System.out.println("\nTXN"+TXN);
    }
}
