package personalMail;

/**
 * Created by Evegeny on 19/07/2016.
 */
public class MailSender {
    public void sendMail(){
        MailInfo mailInfo = DButils.getMailInfo();
        int templateCode = mailInfo.getTemplateCode();
        switch (templateCode) {
            case 1:
                //70 lines of code
                System.out.println("Welcome " + mailInfo.getClientName());
                break;
            default:
                //50 lines of code
                System.out.println("don't call us we call you");
                break;
        }
    }
}
