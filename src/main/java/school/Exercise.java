package school;

import lombok.Data;

/**
 * Created by Evegeny on 21/07/2016.
 */
@Data
public class Exercise {
    private int a;
    private int b;
    private Operator operator;
    private int answer;

    @Override
    public String toString() {
        return a + " " + operator + " " + b + " = " + answer;
    }
}
