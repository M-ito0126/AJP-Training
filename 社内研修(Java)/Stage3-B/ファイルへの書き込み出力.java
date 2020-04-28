import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Date;
import java.text.SimpleDateFormat;

public class VariadicA {
    public static void main(String []args) {
        String[] fruit = {"apple", "lemon", "peach"};
        varA(fruit);
    }
    public static String pathName = "/home/ec2-user/environment/サンプル実行/output/";
    private static void varA(String ... f) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String fileName = "{" + sdf.format(date) + "}_output.txt";
        try {
            FileWriter file = new FileWriter(VariadicA.pathName + fileName);
            PrintWriter pw = new PrintWriter(new BufferedWriter(file));
            //fの要素数の数だけファイルに書き込む
            for(String fruitF : f) {
                pw.println(fruitF);
            }
            pw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}