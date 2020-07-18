package pl.noiseapps.patterns.observer.professor.observer;

public class StudentImpl implements Student {

    private String name;

    public StudentImpl(String name) {
        this.name = name;
    }

    @Override
    public void notify(String testName, boolean passed) {
        String message = passed ? "PASSED" : "FAILED";
        System.out.printf("Hi, I'm %s and I %s the %s test", name, message, testName);
        System.out.println();
    }

    @Override
    public String toString() {
        return name;
    }
}
