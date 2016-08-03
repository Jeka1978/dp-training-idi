package immutable;

import lombok.*;

/**
 * Created by Evegeny on 21/07/2016.
 */
@Value
@AllArgsConstructor
@Builder
public class Person {
    @NonNull
    private String name;
    private int age;
    private int salary;
}
