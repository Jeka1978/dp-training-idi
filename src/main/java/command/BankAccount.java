package command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Value;

/**
 * Created by Evegeny on 21/07/2016.
 */
@AllArgsConstructor
@Data
public class BankAccount {
    private String id;
    private int balance;

    public void addMoney(int delta) {
        balance += delta;
    }
}
