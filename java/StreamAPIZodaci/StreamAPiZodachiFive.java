package StreamAPIZodaci;  // 5. У вас есть коллекция целых чисел. Разделите с остатком на два каждый элемент.

import java.util.ArrayList;
import java.util.List;

public class StreamAPiZodachiFive {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(24);
        list.add(3);
        list.stream().forEach(s-> System.out.println(s%2));
    }
}
