package command.maven;

/**
 * Created by Evegeny on 21/07/2016.
 */
public interface Phase {
    void setPreviousPhase(Phase phase);
    void execute();
    void addGoal(Goal goal);
}
