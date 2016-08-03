package command.maven;

/**
 * Created by Evegeny on 21/07/2016.
 */
public class Package extends AbstractPhase {
    public Package(PackageType type) {
        addGoal(type.getGoal());
    }

    public Package() {
        addGoal(new PackageJarGoal());
    }
}
