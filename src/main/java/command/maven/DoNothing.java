package command.maven;

/**
 * Created by Evegeny on 21/07/2016.
 */
public class DoNothing implements Phase {
    @Override
    public void setPreviousPhase(Phase phase) {

    }

    @Override
    public void execute() {
        System.out.println("this is end");
    }

    @Override
    public void addGoal(Goal goal) {

    }
}
