public class TwentyNine {
    public static void main(String[] args) {
        int a = 27;
        int b = 39;
        int c = 36;

        if (a > b & b>c) {
            System.out.print(c+" "+b+" "+a);
        } else if (a<b & b<c){
            System.out.println(a+" "+b+" "+c);
        }else if (a<c & c<b) {
            System.out.println(a+" "+c+" "+b);
        } else if (a>c & c>b) {
            System.out.println(b+" "+c+" "+a);
        }else if (c<a & a<b) {
            System.out.println(c+" "+a+" "+b);
        }else if (b<a & a<c) {
            System.out.println(b+" "+a+" "+c);
        }else {
            System.out.println("urish xhi tarberak chkar?");
        }

    }
}
