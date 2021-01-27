package StreamAPIZodaci;

import java.util.ArrayList;
import java.util.List;

public class StreamApiZodachiTreti {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("yanvar");
        list.add("fevral");
        list.stream();
        list.forEach(s -> System.out.println(s.length()+1));
    }
}
