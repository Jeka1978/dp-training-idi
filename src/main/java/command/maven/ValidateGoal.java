package command.maven;

/**
 * Created by Evegeny on 21/07/2016.
 */
public class ValidateGoal implements Goal {
    @Override
    public void execute() {
        System.out.println("Checking pom.xml");
    }
}
