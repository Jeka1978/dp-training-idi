package reactive;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Evegeny on 21/07/2016.
 */
@Data
@AllArgsConstructor
public class Beer {
    public String name;
    public String country;
    public float price;
}
