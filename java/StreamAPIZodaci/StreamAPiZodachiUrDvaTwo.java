package StreamAPIZodaci;

import java.util.ArrayList;
import java.util.List;

//У вас есть коллекция строк в которой есть строки состоящие из двух и из трех символов. Превратите её  в коллекцию из трех символьных элементов.
public class StreamAPiZodachiUrDvaTwo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("ok");
        list.add("zet");
        list.add("no");
        list.add("zoo");
list.stream().forEach(s-> dobovlatel(s));

    }
private static void dobovlatel(String s){
        if (s.length()==2){
            s=s+"k";
            System.out.println(s);
        } else {
        System.out.println(s);
    }
   }
  }
