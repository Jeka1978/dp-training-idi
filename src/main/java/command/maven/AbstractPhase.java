package command.maven;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Evegeny on 21/07/2016.
 */
public abstract class AbstractPhase implements Phase {
    private Set<Goal> goals = new HashSet<>();
    private Phase previousPhase = new DoNothing();

    @Override
    public void execute() {
        previousPhase.execute();
        for (Goal goal : goals) {
            goal.execute();
        }
    }

    @Override
    public void addGoal(Goal goal) {
        goals.add(goal);
    }

    @Override
    public void setPreviousPhase(Phase phase) {
        previousPhase = phase;
    }
}
