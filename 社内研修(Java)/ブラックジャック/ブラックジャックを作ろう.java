import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    //mainメソッド
    public static void main(String args[]) {
        process();
    }
    //各処理を纏めたメソッド
    public static void process() {
        //最初の一枚をランダムに取得
        Random rnd = new Random();
        int rand = rnd.nextInt(10) + 1;
        //合計に加算
        int total =+ rand;
        System.out.println("『数値：[取得したランダム数値]　合計：[" + total + "]』");
        //scanメソッドの呼び出し
        scan(total);
    }
    //Scannerを使用するメソッド
    public static void scan(int tl) {
        System.out.println("『次のランダム数値を取得しますか[Y/N]』");
        Scanner sc = new Scanner(System.in);
        String yn = sc.next();
        //selectメソッドの呼び出し
        select(tl, yn);
    }
    //YかNかで分岐するメソッド
    public static void select(int t, String sel) {
        //文字入力値がYの場合
        if(sel.equals("Y")) {
            //追加のカードを1~10からランダムに一枚取得
            Random rnd = new Random();
            int plasRand = rnd.nextInt(10) + 1;
            //合計に加算
            t += plasRand;
            System.out.println("『数値：[取得したランダム数値]　取得数：[" + plasRand + "]合計：[" + t + "]』");
            //合計が21より大きい場合「LOSE」と出力
            if(t > 21) {
                System.out.println("「LOSE」");
            }
            //そうでない場合scanメソッドへと戻る
            else {
                scan(t);
            }
        }
        //文字入力値がNの場合
        else if(sel.equals("N")) {
            //ディーラー側のカードを15~22からランダムに一枚取得
            Random rnd = new Random();
            int dealerRand = rnd.nextInt(8) + 15;
            System.out.println("『親数値：[" + dealerRand + "]　合計：[" + t + "]』");
            //親数値が22より大きい場合
            if(dealerRand > 22) {
                System.out.println("「WIN」");
            }
            //親数値が合計より大きい場合
            else if(dealerRand > t) {
                System.out.println("「LOSE」");
            }
            //親数値が合計と同じ場合
            else if(dealerRand == t) {
                System.out.println("「DRAW」");
            }
            //親数値が合計より小さい場合
            else if(dealerRand < t) {
                System.out.println("「WIN」");
            }
        }
        //文字入力値がYとNではない場合scanメソッドへと戻る
        else {
            System.out.println("Y/Nでえらんでね");
            scan(t);
        }
    }
}