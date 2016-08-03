package command.maven;

/**
 * Created by Evegeny on 21/07/2016.
 */
public class Initialize extends AbstractPhase {
    public Initialize() {
        addGoal(new InitializeGoal());
    }
}
