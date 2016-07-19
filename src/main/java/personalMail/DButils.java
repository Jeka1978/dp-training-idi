package personalMail;

import org.fluttercode.datafactory.impl.DataFactory;

import java.util.Random;

/**
 * Created by Evegeny on 19/07/2016.
 */
public class DButils {
    private static DataFactory dataFactory = new DataFactory();
    public static MailInfo getMailInfo() {

        return new MailInfo(dataFactory.getName(),dataFactory.getNumberBetween(1,4));
    }
}
