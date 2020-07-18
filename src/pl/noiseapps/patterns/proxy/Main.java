package pl.noiseapps.patterns.proxy;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        AuthContext.getInstance().setUserId(new Random().nextInt(100));
        Calculator hc = new HeavyCalculator();
        Calculator ccp = new CachingCalculatorProxy((HeavyCalculator) hc);
        Calculator tlp = new TimeLoggingProxy((CachingCalculatorProxy) ccp);
        Calculator ap = new AuthProxy((TimeLoggingProxy) tlp);
        // wrap with auth proxy
        for (int i = 0; i < 50; i++) {
            AuthContext.getInstance().setUserId(new Random().nextInt(100));
            ap.generateHeavyString();
            System.out.println();
        }
    }
}
