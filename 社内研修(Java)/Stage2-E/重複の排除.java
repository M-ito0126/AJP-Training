import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Samp{
    public static void main(String []args) {
        String fruit = "orange,apple,cherry,orange,grape,apple";
        String[] fruitArray = fruit.split(",");
        List<String> listF = Arrays.asList(fruitArray);
        Set<String> set = new HashSet<String>();
        int i = 0;
        for(String str : listF) {
            //setに追加してみて、追加できない値を出力
            if(!set.add(str)) {
                i++;
                System.out.println(i +  "：" + str);
            }
        }
    }
}