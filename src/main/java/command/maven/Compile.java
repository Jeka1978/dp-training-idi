package command.maven;

/**
 * Created by Evegeny on 21/07/2016.
 */
public class Compile extends AbstractPhase {
    public Compile() {
        addGoal(new CompileGoal());
    }
}
