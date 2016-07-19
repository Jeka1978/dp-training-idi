package personalMail;

/**
 * Created by Evegeny on 19/07/2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException, InstantiationException, IllegalAccessException {
        MailSender mailSender = new MailSender();
        while (true) {
            mailSender.sendMail();
            Thread.sleep(1000);
        }
    }
}
