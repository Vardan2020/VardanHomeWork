package StreamAPIZodaci;
//2.5 У вас есть коллекция отрицательных и положительных  целых чисел. Превратите её в коллекцию положительных чисел.
import java.util.ArrayList;
import java.util.List;

public class StreamAPiZodachiUrDvaFive {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(-8);
        list.add(71);
        list.add(47);
        list.add(-6);
        list.add(-7);
        list.stream().forEach(s-> polojitelni(s));

    }
    private static void polojitelni(int s){
        if (s < 0) {
            s = s * (-1);
            System.out.println(s);
        } else {
            System.out.println(s);
        }
    }
}


