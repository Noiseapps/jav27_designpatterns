package pl.noiseapps.patterns.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class Radio {

    private Thread broadcastingThread;
    private final List<Listener> listeners = new CopyOnWriteArrayList<>();

    public void startBroadcasting() {
        if (broadcastingThread == null) {
            broadcastingThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        String broadcastData = randomSalt();
                        System.out.println("Radio starts broadcasting " + broadcastData);
                        listeners.forEach((listener -> listener.receiveData(broadcastData)));
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
        broadcastingThread.start();
    }

    public void subscribe(Listener listener) {
        if(!listeners.contains(listener)) {
            listeners.add(listener);
        }
    }

    public void unsubscribe(Listener listener) {
        listeners.remove(listener);
    }

    private String randomSalt() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }
}
