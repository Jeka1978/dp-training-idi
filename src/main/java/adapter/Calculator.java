package adapter;


import java.util.List;

/**
 * Created by Evegeny on 21/07/2016.
 */
public class Calculator {
    public static int calcAll(List<Pricable> pricables) {
        return pricables.parallelStream().mapToInt(Pricable::getPrice).sum();
    }
}
