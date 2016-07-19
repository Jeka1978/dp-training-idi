package personalMail;

import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Evegeny on 19/07/2016.
 */
public class MailSender {
    private Map<Integer, MailGenerator> map = new HashMap<Integer, MailGenerator>();

    public MailSender() throws IllegalAccessException, InstantiationException {
        Reflections scanner = new Reflections("personalMail");
        Set<Class<? extends MailGenerator>> classes = scanner.getSubTypesOf(MailGenerator.class);
        for (Class<? extends MailGenerator> aClass : classes) {
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                TemplateCode annotation = aClass.getAnnotation(TemplateCode.class);
                if (annotation == null) {
                    throw new RuntimeException("if you implement ifc Mailgenerator you need to annotated it with @TemplateCode");
                }
                MailGenerator mailGenerator = aClass.newInstance();
                if (map.containsKey(annotation.value())) {
                    throw new RuntimeException("mailcode" + annotation.value() + " already in use");
                }
                map.put(annotation.value(), mailGenerator);
            }
        }
    }

    public void sendMail(){
        MailInfo mailInfo = DButils.getMailInfo();
        int templateCode = mailInfo.getTemplateCode();
        MailGenerator mailGenerator = map.get(templateCode);
        if (mailGenerator == null) {
            throw new RuntimeException("mailcode " + templateCode + " not bound");
        }
        String body = mailGenerator.generateBody(mailInfo);
        send(body);
    }

    private void send(String body) {
        System.out.println("mail sent "+body);
    }
}
