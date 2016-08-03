package command;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 21/07/2016.
 */
public class AccountManagerTest {

    @Test
    public void testUndo() throws Exception {
        BankAccount account1 = new BankAccount("1", 100);
        BankAccount account2 = new BankAccount("2", 200);
        AccountManager accountManager = new AccountManager();
        accountManager.deposit(account1,50);
        //acc1 = 150
        accountManager.transferMoney(account1,account2,10);
        //acc = 140, acc2 = 210
        accountManager.deposit(account2,300);
        //acc2 = 510
        assertEquals(510,account2.getBalance());
        assertEquals(140,account1.getBalance());
        accountManager.undo();
        accountManager.undo();
        accountManager.undo();
        assertEquals(100,account1.getBalance());
        assertEquals(200,account2.getBalance());


    }
}




