package command.maven;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Evegeny on 21/07/2016.
 */
@AllArgsConstructor
@Getter
public enum PackageType {
    JAR(new PackageJarGoal()),
    WAR(new PackageWarGoal());

    private final Goal goal;
}





