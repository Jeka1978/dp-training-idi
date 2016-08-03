package command.maven;

/**
 * Created by Evegeny on 21/07/2016.
 */
public class Lifecycle {
    public static void main(String[] args) {
        Install install = new Install();
        Package aPackage = new Package();
        Test test = new Test();
        test.addGoal(new SendMailToBabushka());
        TestCompile testCompile = new TestCompile();
        Compile compile = new Compile();
        GenerateSources generateSources = new GenerateSources();
        Initialize initialize = new Initialize();
        Validate validate = new Validate();
        install.setPreviousPhase(aPackage);
        aPackage.setPreviousPhase(test);
        test.setPreviousPhase(testCompile);
        testCompile.setPreviousPhase(compile);
        compile.setPreviousPhase(generateSources);
        generateSources.setPreviousPhase(initialize);
        initialize.setPreviousPhase(validate);
        test.execute();
    }
}
