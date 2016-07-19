package personalMail;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Evegeny on 19/07/2016.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface TemplateCode {
    int value();
}
