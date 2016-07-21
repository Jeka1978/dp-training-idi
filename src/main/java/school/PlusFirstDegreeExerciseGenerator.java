package school;

import java.util.Random;

/**
 * Created by Evegeny on 21/07/2016.
 */
public class PlusFirstDegreeExerciseGenerator implements ExerciseGenerator {
    private RangeExerciseGeneratorAssistant assistant = new RangeExerciseGeneratorAssistant(10);

    public Exercise generate() {
        Exercise exercise = assistant.generateTemplate();
        exercise.setAnswer(exercise.getA()+exercise.getB());
        exercise.setOperator(Operator.PLUS);
        return exercise;
    }
}
