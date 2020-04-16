public class Array {
    public static void main(String []args) {
        String word = "orange,apple,cherry,grape,apple";
        
        String[] fruit = word.split(",");
        
        System.out.println("１：" + fruit[0]);
        System.out.println("２：" +  fruit[1]);
        System.out.println("３：" +  fruit[2]);
        System.out.println("４：" +  fruit[3]);
        System.out.println("５：" +  fruit[4]);
    }
}