import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.text.SimpleDateFormat;

public class AddBehavior {
    public static void main(String []args) {
        String[] fruit = {"Apple", "lemon", "peach"};
        fileOperation(fruit);
    }
    public static String pathName = "/home/ec2-user/environment/サンプル実行/output/";
    private static void fileOperation(String ... f) {
        //ファイル名に現在日付を入れる
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String fileName = "{" + sdf.format(date) + "}_output.txt";
        //新しいファイルを作る、既に同名ファイルが存在する場合は上書する
        try {
            FileWriter fw = new FileWriter(AddBehavior.pathName + fileName, false);
            PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
            //fの要素数の数だけファイルに書き込む
            for(String fruitF : f) {
                pw.println(fruitF);
            }
            pw.close();
        }
        //スタックトレース（例外内容）を出力する
        catch (IOException e) {
            e.printStackTrace();
        }
        //ファイルを日付順にソート
        File dir = new File("output/");
        File[] dirFiles = dir.listFiles();
        Arrays.sort(dirFiles, new Comparator<File>() {
            public int compare(File df1, File df2) {
                return Long.valueOf(df2.lastModified()).compareTo(df1.lastModified());
            }
        });
        //ファイル数が５より多い場合、ファイルを削除しファイル数を５にする
        if(dirFiles.length > 5) {
            for(int i = 5; i < dirFiles.length; i++) {
                dirFiles[i].delete();
            }
        }
    }
}