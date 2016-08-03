package adapter;

import lombok.AllArgsConstructor;

/**
 * Created by Evegeny on 21/07/2016.
 */
@AllArgsConstructor
public class Costable2PricableAdapter implements Pricable {
    private Costable costable;
    @Override
    public int getPrice() {
        return costable.getCost();
    }
}
