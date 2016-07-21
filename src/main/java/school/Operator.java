package school;

import lombok.AllArgsConstructor;

/**
 * Created by Evegeny on 21/07/2016.
 */
@AllArgsConstructor
public enum Operator {
    PLUS("+"),MINUS("-"),MULTIPLY("*");
    private final String sign;


    @Override
    public String toString() {
        return sign;
    }
}
