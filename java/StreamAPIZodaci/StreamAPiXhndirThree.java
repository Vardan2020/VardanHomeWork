package StreamAPIZodaci;  // 3. У вас есть коллекция строк. Увеличьте длину каждого элемента коллекции на один символ.

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class StreamAPiXhndirThree {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("yanvar");
        list.add("fevral");
        list.stream();
        list.forEach(s -> System.out.println(s.length()*2));
    }
}
