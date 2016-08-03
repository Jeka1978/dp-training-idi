package command;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by Evegeny on 21/07/2016.
 */
public class AccountManager {
    private Deque<Command> commands = new LinkedList<>();

    public void deposit(BankAccount account, int delta) {
        commands.add(new DepositCommand(account, delta * -1));
        new DepositCommand(account, delta).execute();
    }

    public void transferMoney(BankAccount account1, BankAccount account2, int delta) {
        new TransferCommand(account1, account2, delta).execute();
        commands.add(new TransferCommand(account2, account1, delta));
    }
    public void undo(){
        commands.removeLast().execute();
    }
}




