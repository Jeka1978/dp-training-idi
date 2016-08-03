package command;

import lombok.AllArgsConstructor;
import lombok.Value;

/**
 * Created by Evegeny on 21/07/2016.
 */
@AllArgsConstructor
@Value
public class DepositCommand implements Command {
    private BankAccount bankAccount;
    private int delta;

    @Override
    public void execute() {
       bankAccount.addMoney(delta);
    }
}
