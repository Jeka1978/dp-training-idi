package command;

import lombok.AllArgsConstructor;
import lombok.Value;

/**
 * Created by Evegeny on 21/07/2016.
 */
@AllArgsConstructor
@Value
public class TransferCommand implements Command {
    private BankAccount bankAccountFrom;
    private BankAccount bankAccountTo;
    private int delta;
    @Override
    public void execute() {
        bankAccountFrom.addMoney(delta*-1);
        bankAccountTo.addMoney(delta);
    }
}
