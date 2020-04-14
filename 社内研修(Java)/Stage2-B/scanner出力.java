import java.util.Scanner;

public class Scan {
    public static void main(String []args) {
        
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        scanner.close();
        
        String initial = word.substring(0, 1);
        String endWord = word.substring(word.length() -1);
        
        System.out.println("入力された値は{" + word + "}です");
        System.out.println("桁数：{" + word.length() + "}桁");
        if (word.length() > 1) {
            System.out.println("頭文字：{" + initial + "}");
            System.out.println("語尾：{" + endWord + "}");
        }
    }
}