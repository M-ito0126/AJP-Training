iimport java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Duplication{
    public static void main(String []args) {
        String fruit = "orange,apple,cherry,orange,grape,apple";
        String[] fruitArray = fruit.split(",");
        List<String> listFruit = Arrays.asList(fruitArray);
        Set<String> set = new HashSet<String>();
        int cnt = 0;
        for(String str : listFruit) {
            //setに追加してみて、追加できない値を出力
            if(!set.add(str)) {
                cnt++;
                System.out.println(cnt +  "：" + str);
            }
        }
    }
}