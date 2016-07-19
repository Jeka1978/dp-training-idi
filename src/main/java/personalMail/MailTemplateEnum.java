package personalMail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * Created by Evegeny on 19/07/2016.
 */
@AllArgsConstructor
public enum MailTemplateEnum {
    WELCOME(1,new WelcomeMailGenerator()),
    EMAIL_CALLBACK(2,new EmailCallbackMailGenerator());

    private final int templateCode;
    @Getter
    private final MailGenerator mailGenerator;

    public static MailTemplateEnum findByTemplateCode(int templateCode)  {
        for (MailTemplateEnum value : values()) {
            if (value.templateCode == templateCode) {
                return value;
            }
        }
        throw new RuntimeException(templateCode + " not mapped to enum");
    }




}
