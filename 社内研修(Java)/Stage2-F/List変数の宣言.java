import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Week {
    public static void main(String []args) {
        List<String> list = new ArrayList<String>();
        
        Collections.addAll(list, "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday");
        //文字列型の変数weekにlistの値を代入   
       for(String week:list) {
           System.out.println(week);
       }
    }
}