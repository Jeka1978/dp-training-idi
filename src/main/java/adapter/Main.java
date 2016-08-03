package adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evegeny on 21/07/2016.
 */
public class Main {
    public static void main(String[] args) {
        List<Pricable> products = new ArrayList<>();
        for (int i = 0; i<10; i++) {
            products.add(new Costable2PricableAdapter(Repository.getProduct()));
        }
        int sum = Calculator.calcAll(products);
        System.out.println("sum = " + sum);
    }
}
