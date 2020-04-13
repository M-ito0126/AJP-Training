import java.util.Date;
import java.text.SimpleDateFormat;

public class Type {
    public static void main(String []args) {
        char c = 65;
        String name = "伊藤";
        int number = 45;
        boolean bool = true;
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/E");
        
    System.out.println(c);
    System.out.println(name);
    System.out.println(number);
    System.out.println(true);
    System.out.println(sdf.format(date));
    
    }
}