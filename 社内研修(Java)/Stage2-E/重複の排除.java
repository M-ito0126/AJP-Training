import java.util.Arrays;
import java.util.List;

public class Duplication {
    public static void main(String []args) {
        String fruit = "orange/apple/cherry/orange/grape/apple";
        String[] fruitArray = {"orange", "apple", "cherry", "orange", "grape", "apple"};
        
        List list = Arrays.asList(fruitArray);
        if(list.contains("orange") && list.contains("apple")){
            System.out.println("１：" + fruitArray[0]);
            System.out.println("２：" + fruitArray[1]);
        }
    }
}