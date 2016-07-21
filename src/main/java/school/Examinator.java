package school;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Evegeny on 21/07/2016.
 */
public class Examinator {
    private List<ExerciseGenerator> exerciseGenerators = new ArrayList<ExerciseGenerator>();

    public void addExerciseGenerator(ExerciseGenerator exerciseGenerator) {
        exerciseGenerators.add(exerciseGenerator);
    }

    public Exercise generateExercise() {
        Random random = new Random();
        ExerciseGenerator generator = exerciseGenerators.get(random.nextInt(exerciseGenerators.size()));
        return generator.generate();
    }
}








