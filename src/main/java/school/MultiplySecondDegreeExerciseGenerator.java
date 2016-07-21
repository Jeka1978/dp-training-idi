package school;

/**
 * Created by Evegeny on 21/07/2016.
 */
public class MultiplySecondDegreeExerciseGenerator implements ExerciseGenerator {
    private RangeExerciseGeneratorAssistant assistant = new RangeExerciseGeneratorAssistant(5);

    public Exercise generate() {
        Exercise exercise = assistant.generateTemplate();
        exercise.setAnswer(exercise.getA()*exercise.getB());
        exercise.setOperator(Operator.MULTIPLY);
        return exercise;
    }
}
