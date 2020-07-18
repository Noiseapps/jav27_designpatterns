package pl.noiseapps.patterns.observer.professor.observer;

import java.util.HashMap;
import java.util.Map;

public class MathsProfessor implements Professor {

    int targetScore = 70;

    private final Map<Student, Score> students = new HashMap<>();

    @Override
    public void subscribe(Student student) {
        Score score = Score.randomScore();
        System.out.printf("Student %s finished the maths test with score %s\n", student.toString(), score.toString());
        students.put(student, score);
    }

    @Override
    public void publishTestResults() {
        students.forEach((student, score) -> student.notify("maths", score.isPassingScore(targetScore)));
    }


}
