public class TwentyOne {
    public static void main(String[] args) {
        int a = 10;
        int b = 17;
        int c = 9;

        if (a > b & b > c) {
            System.out.println(a);
        } else if (b > a & a > c) {
            System.out.println(b);
        } else if (c > b & b > a) {
            System.out.println(c);
        }
    }
}
