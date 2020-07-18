package pl.noiseapps.patterns.observer.professor.observer;

public interface Professor {

    void subscribe(Student student);

    void publishTestResults();

}
