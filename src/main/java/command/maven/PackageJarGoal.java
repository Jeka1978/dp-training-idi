package command.maven;

/**
 * Created by Evegeny on 21/07/2016.
 */
public class PackageJarGoal implements Goal {
    @Override
    public void execute() {
        System.out.println("packaging to jar ");
    }
}
