package personalMail;

/**
 * Created by Evegeny on 19/07/2016.
 */
public class WelcomeMailGenerator implements MailGenerator {
    public String generateBody(MailInfo mailInfo) {
        // 70 lines of code
        return "<html> Welcome " + mailInfo.getClientName() + " </html>";
    }
}
