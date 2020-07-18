package pl.noiseapps.patterns.observer.professor.observer;

import java.util.Random;

public class Score {

    private static final Random random = new Random();

    private final int score;

    public Score(int score) {
        this.score = score;
    }

    public boolean isPassingScore(int targetScore) {
        return this.score >= targetScore;
    }

    public static Score randomScore() {
        return new Score(random.nextInt(100));
    }

    @Override
    public String toString() {
        return String.valueOf(score);
    }
}
