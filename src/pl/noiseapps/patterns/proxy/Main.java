package pl.noiseapps.patterns.proxy;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int userId = new Random().nextInt(100);
        Calculator hc = new HeavyCalculator();

        hc.generateHeavyString();
        System.out.println();
        hc.generateHeavyString();
        System.out.println();
        hc.generateHeavyString();
        System.out.println();


        Calculator ccp = new CachingCalculatorProxy((HeavyCalculator) hc);
        Calculator tlp = new TimeLoggingProxy((CachingCalculatorProxy) ccp);
        tlp.generateHeavyString(); // only if userId > 50
        System.out.println();
        tlp.generateHeavyString(); // only if userId > 50
        System.out.println();
        tlp.generateHeavyString(); // only if userId > 50
        System.out.println();


    }
}
