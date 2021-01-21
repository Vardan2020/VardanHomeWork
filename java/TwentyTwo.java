public class TwentyTwo {
    public static void main(String[] args) {
        int a = 53;
        int b = 37;
        int c = 605;

        if(a<b & b<c ) {
            System.out.println(a);
        }
        else  if (b<a & a<c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
    }
}
