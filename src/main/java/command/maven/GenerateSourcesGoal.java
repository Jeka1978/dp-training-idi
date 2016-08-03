package command.maven;

/**
 * Created by Evegeny on 21/07/2016.
 */
public class GenerateSourcesGoal implements Goal {
    @Override
    public void execute() {
        System.out.println("Lets generate some code from wizard xmls");
    }
}
