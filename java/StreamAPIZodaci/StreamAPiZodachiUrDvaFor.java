package StreamAPIZodaci;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// 2.4 У вас есть коллекция строк. Прибавьте ко всем элементам один символ и выведите первый элемент коллекции.
public class StreamAPiZodachiUrDvaFor {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("fear");
        list.add("bol");
        list.add("depresia");
        list.stream();
        list.stream().forEach(s -> s=s+"m");
        System.out.println(list.stream().findFirst());

    }

public static void concut(String d){
        d=d+"m";
    System.out.println(d);
}
    }

