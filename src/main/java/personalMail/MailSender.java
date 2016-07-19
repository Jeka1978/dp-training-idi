package personalMail;

/**
 * Created by Evegeny on 19/07/2016.
 */
public class MailSender {
    public void sendMail(){
        MailInfo mailInfo = DButils.getMailInfo();
        int templateCode = mailInfo.getTemplateCode();
        MailTemplateEnum templateEnum = MailTemplateEnum.findByTemplateCode(templateCode);
        String body = templateEnum.getMailGenerator().generateBody(mailInfo);
        send(body);
    }

    private void send(String body) {
        System.out.println("mail sent "+body);
    }
}
