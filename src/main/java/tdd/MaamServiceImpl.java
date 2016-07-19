package tdd;

import lombok.SneakyThrows;

/**
 * Created by Evegeny on 19/07/2016.
 */
public final class MaamServiceImpl implements MaamService {
    @SneakyThrows
    public double getMaam() {
        Thread.sleep(190000);
        return 0.138746237;
    }

    public void x() {

    }

    public void y() {

    }
}
