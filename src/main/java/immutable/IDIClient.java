package immutable;

import lombok.Getter;
import lombok.ToString;

/**
 * Created by Evegeny on 21/07/2016.
 */

@Getter
@ToString
public class IDIClient {
    private final String name;
    private final int bonus;
    private final int debt;

    private IDIClient(String name, int bonus, int debt) {
        this.name = name;
        this.bonus = bonus;
        this.debt = debt;
    }

    public IDIClient addBonus(int delta) {
        return new IDIClient(name, bonus + delta, debt);
    }

    public static class Builder {
        private String name;
        private int bonus;
        private int debt;
        private boolean used;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder bonus(int bonus) {
            this.bonus = bonus;
            return this;
        }

        public Builder debt(int debt) {
            this.debt = debt;
            return this;
        }

        public IDIClient build() {
            if (used) {
                throw new RuntimeException("builder can't be used twice");
            }
            used=true;
            validate();
            return new IDIClient(name, bonus, debt);
        }

        private void validate() {
            if (name == null) {
                throw new RuntimeException("name is mandatory");
            }
        }
    }


}
