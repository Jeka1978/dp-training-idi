package command.maven;

/**
 * Created by Evegeny on 21/07/2016.
 */
public class Validate extends AbstractPhase {
    public Validate() {
        addGoal(new ValidateGoal());
    }
}
