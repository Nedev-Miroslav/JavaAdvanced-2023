package A00PreviousExams.workout;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Workout {

    private List<Exercise> exercises;
    private String type;
    private int exerciseCount;

    public Workout(String type, int exerciseCount) {
        this.type = type;
        this.exerciseCount = exerciseCount;
        this.exercises = new ArrayList<>();
    }




    public void addExercise(Exercise exercise) {
        if (this.exercises.size() + 1 <= exerciseCount) {
            exercises.add(exercise);
        }

    }

    public boolean removeExercise(String name, String muscle) {
        for (Exercise exercise : exercises) {
            if (exercise.getName().equals(name) && exercise.getMuscle().equals(muscle)) {
                this.exercises.remove(exercise);
                return true;
            }
        }
        return false;

    }

    public Exercise getExercise(String name, String muscle) {
        for (Exercise exercise : exercises) {
            if (exercise.getName().equals(name) && exercise.getMuscle().equals(muscle)) {
                return exercise;
            }
        }
        return null;

    }

    public Exercise getMostBurnedCaloriesExercise() {
        if (exercises.isEmpty()) {
            return null;
        } else {
            return this.exercises.stream()
                    .sorted((c1, c2) -> Integer.compare(c2.getBurnedCalories(), c1.getBurnedCalories()))
                    .collect(Collectors.toList())
                    .get(0);
        }

    }

    public int getExerciseCount() {
        return exerciseCount;
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Workout type: %s", this.type));
        for (Exercise exercise : exercises) {
            sb.append(System.lineSeparator());
            sb.append(exercise);
        }
        return sb.toString();

    }


}
