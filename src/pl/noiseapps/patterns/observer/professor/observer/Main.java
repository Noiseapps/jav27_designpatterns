package pl.noiseapps.patterns.observer.professor.observer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Integer x;

    public static void main(String[] args) throws InterruptedException {
        int x = 1;
        int y = 2;

        System.out.println(x + y + " ");

        List<Professor> professors = new ArrayList<>();
        professors.add(new MathsProfessor());
        professors.add(new PhysicsProfessor());

        for (int i = 0; i < 100; i++) {
            int finalI = i;
            professors.forEach((professor -> {
                professor.subscribe(new StudentImpl(String.format("Student #%d", finalI)));
            }));
        }

        Thread.sleep(5000);
        professors.forEach(Professor::publishTestResults);
    }
}
