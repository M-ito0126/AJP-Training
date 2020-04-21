public class Mesod {
    public static void main(String []args) {
        double total = circleArea(5);
        System.out.println(total);
    }
    private static double circleArea(int i) {
        double pi = 3.14;
        return i * i * pi;
    }
}