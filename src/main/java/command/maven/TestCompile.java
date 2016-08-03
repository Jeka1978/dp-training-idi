package command.maven;

/**
 * Created by Evegeny on 21/07/2016.
 */
public class TestCompile extends AbstractPhase {
    public TestCompile() {
        addGoal(new TestCompileGoal());
    }
}
