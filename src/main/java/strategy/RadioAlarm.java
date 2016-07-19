package strategy;

import lombok.Singular;
import lombok.experimental.Delegate;

/**
 * Created by Evegeny on 19/07/2016.
 */
public class RadioAlarm implements Radio,Alarm {
    @Delegate
    private Radio radio = new RadioImpl();
    @Delegate
    private Alarm alarm = new AlarmImpl();
}
