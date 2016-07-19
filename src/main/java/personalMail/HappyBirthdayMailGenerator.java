package personalMail;

/**
 * Created by Evegeny on 19/07/2016.
 */
@TemplateCode(4)
public class HappyBirthdayMailGenerator implements MailGenerator {
    public String generateBody(MailInfo mailInfo) {
        return "happy birthday "+mailInfo.getClientName();
    }
}
