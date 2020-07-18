package pl.noiseapps.patterns.observer;

import java.util.UUID;

public class RadioListener implements Listener {

    private final String listenerId;

    public RadioListener() {
        this.listenerId = UUID.randomUUID().toString();
    }

    @Override
    public void receiveData(String radioData) {
        System.out.println("Listener " + listenerId + " received radio data: " + radioData);
    }
}
