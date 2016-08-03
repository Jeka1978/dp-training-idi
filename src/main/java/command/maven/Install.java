package command.maven;

/**
 * Created by Evegeny on 21/07/2016.
 */
public class Install extends AbstractPhase {
    public Install() {
        addGoal(new InstallGoal());
    }
}
