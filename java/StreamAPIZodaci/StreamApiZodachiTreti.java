package StreamAPIZodaci;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiZodachiTreti {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("yanvar");
        list.add("fevral");
        Stream<String> stream = list.stream();
        stream.forEach(s -> System.out.println(s+"k"));
    }
}
