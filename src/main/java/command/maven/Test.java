package command.maven;

/**
 * Created by Evegeny on 21/07/2016.
 */
public class Test extends AbstractPhase {
    public Test() {
        addGoal(new TestGoal());
    }
}
