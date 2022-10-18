// 7. Find out how many images are in the given array:
//["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]
//Output: 3

package stringManipulation;

public class countImageFIles {
    public static void main(String[] args) {
        String[] strArr =new String[] {"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};
        int count = 0;
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].contains("jpg") || strArr[i].contains("png"))
                count++;
        }
        System.out.println("Number of images = " + count);
    }
}
