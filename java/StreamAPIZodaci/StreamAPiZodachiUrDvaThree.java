package StreamAPIZodaci;

import java.util.ArrayList;
import java.util.List;

//2.3 У вас есть коллекция целых чисел. Прибавьте ко всем элементам 1 и выведите количество элементов в коллекции.
public class StreamAPiZodachiUrDvaThree {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(11);
        list.add(2);
        list.add(499);
        list.add(87);
list.stream().forEach(s-> sum(s));


    }
private static void sum(int x){
        x=x+1;
    System.out.println(x);
}

}
