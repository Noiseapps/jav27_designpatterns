package pl.noiseapps.patterns.observer;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Radio radio = new Radio();
        radio.startBroadcasting();
        RadioListener r1 = new RadioListener();
        radio.subscribe(r1);
        Thread.sleep(2500);
        RadioListener r2 = new RadioListener();
        radio.subscribe(r2);
        Thread.sleep(2500);
        RadioListener r3 = new RadioListener();
        radio.subscribe(r3);

        Thread.sleep(7000);
        radio.unsubscribe(r2);
        radio.unsubscribe(r3);

        Thread.sleep(25000);
    }
}
