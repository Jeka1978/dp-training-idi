package immutable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Singular;

import java.util.Date;
import java.util.List;

/**
 * Created by Evegeny on 21/07/2016.
 */
@Builder
public class Bottle {
    private String name;
    private int price;
    private Date date;
    @Singular
    private List<String> components;
}
