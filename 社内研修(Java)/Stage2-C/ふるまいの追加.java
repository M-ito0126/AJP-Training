import java.util.Scanner;

public class Contain {
    public static void main(String []args) {
        
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        scanner.close();
        
        String initial = word.substring(0, 1);
        String endWord = word.substring(word.length() -1);
        int index = word.indexOf("A");
        
        System.out.println("入力された値は{" + word + "}です");
        System.out.println("桁数：{" + word.length() + "}桁");
        //入力された文字の長さが１より大きい場合、出力
        if (word.length() > 1) {
            System.out.println("頭文字：{" + initial + "}");
            System.out.println("語尾：{" + endWord + "}");
        }
        String result;
        //文字列にAが含まれている場合
        if (index != -1) {
            result = "yes";
        }
        //文字列にAが含まれていない場合
        else {
            result = "no";
        }
        System.out.println("文字列にAを含む：{" + result + "}");
    }
}
}