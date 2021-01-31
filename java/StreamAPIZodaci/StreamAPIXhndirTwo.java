package StreamAPIZodaci;  // 2. У вас есть коллекция целых чисел. Умножьте каждое число на 2

import java.util.ArrayList;
import java.util.List;

public class StreamAPIXhndirTwo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(70);
        list.add(27);
        list.stream().forEach(s-> System.out.println(s*2));



    }
}
