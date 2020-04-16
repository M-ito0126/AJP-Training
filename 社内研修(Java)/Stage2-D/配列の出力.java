public class Array {
    public static void main(String []args) {
        String word = "orange,apple,cherry,grape,apple";
        
        String[] fruit = word.split(",");
        //配列fruitの要素数よりiが少ない場合出力し、その後１を足す
        for(int i = 0; i < fruit.length; i++) {
            System.out.println(i+1 + "：" + fruit[i]);
        }
    }
}