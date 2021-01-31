package StreamAPIZodaci;  // 4. У вас есть коллекция строк. Переведите символы каждого элемента коллекции в верхний регистр

import java.util.ArrayList;
import java.util.List;

public class StreamAPiZodachiFor {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("gorod");
        list.add("oblost");
        list.stream();
        list.forEach(s -> System.out.println(s.toUpperCase()));
    }
}
