package personalMail;

/**
 * Created by Evegeny on 19/07/2016.
 */
@TemplateCode(3)
public class DinnerProposalMailGenerator implements MailGenerator {
    public String generateBody(MailInfo mailInfo) {
        return "lets go to eat something";
    }
}
