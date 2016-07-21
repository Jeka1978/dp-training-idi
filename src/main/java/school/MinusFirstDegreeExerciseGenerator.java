package school;

import java.util.Random;

/**
 * Created by Evegeny on 21/07/2016.
 */
public class MinusFirstDegreeExerciseGenerator implements ExerciseGenerator {

    public Exercise generate() {
        Random random = new Random();
        Exercise exercise = new Exercise();
        exercise.setA(random.nextInt(10));
        exercise.setB(random.nextInt(exercise.getA()));
        exercise.setAnswer(exercise.getA()-exercise.getB());
        exercise.setOperator(Operator.MINUS);
        return exercise;
    }
}
