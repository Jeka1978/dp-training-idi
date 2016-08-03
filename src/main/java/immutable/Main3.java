package immutable;

import java.util.*;

/**
 * Created by Evegeny on 21/07/2016.
 */
public class Main3 {
    public static void main(String[] args) {
        Bottle.builder().component("water").component("alchohol").price(122).build();

        List<String> strings = Arrays.asList("java", "scala", "groovy");
        strings.sort((o1, o2) -> o1.length() - o2.length());
        strings.forEach(System.out::println);


    }
}
