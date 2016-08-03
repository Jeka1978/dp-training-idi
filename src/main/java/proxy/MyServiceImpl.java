package proxy;

/**
 * Created by Evegeny on 28/07/2016.
 */

public class MyServiceImpl implements MyService {
    @Override
    @Benchmark
    public void doX() {
        System.out.println("XXXXXXXXXXXXXXXXXXXXX");
    }
}
