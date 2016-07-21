package school;

import lombok.AllArgsConstructor;

import java.util.Random;

/**
 * Created by Evegeny on 21/07/2016.
 */
@AllArgsConstructor
public class RangeExerciseGeneratorAssistant implements ExerciseGeneratorAssistant {

    private final int max;

    public Exercise generateTemplate() {
        Random random = new Random();
        Exercise exercise = new Exercise();
        exercise.setA(random.nextInt(max));
        exercise.setB(random.nextInt(max));
        return exercise;
    }
}
