package school;

/**
 * Created by Evegeny on 21/07/2016.
 */
public class Main {
    public static void main(String[] args) {
        Examinator examinator = new Examinator();
        examinator.addExerciseGenerator(new MinusFirstDegreeExerciseGenerator());
        examinator.addExerciseGenerator(new PlusFirstDegreeExerciseGenerator());
        examinator.addExerciseGenerator(new MultiplySecondDegreeExerciseGenerator());
        for (int i = 0; i < 10; i++) {
            System.out.println(examinator.generateExercise());
        }

    }
}
