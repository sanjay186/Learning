package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class streamsExample {

    private List<String> sumOfInteger(List<String> list) {
     //   return list.stream().filter(i -> i <10).mapToInt(i -> i).sum();

        return  list.stream().map(f -> f.replaceAll("Sanjay","uyuyuy")).collect(Collectors.toList());
    }

    public static void main(String... args) {
        streamsExample es = new streamsExample();
        List<String> list = new ArrayList<>();
        list.add("Sanjay");
        list.add("lakai");
        list.add("sdfaesdf");
       System.out.println( es.sumOfInteger(list));
    }
}
