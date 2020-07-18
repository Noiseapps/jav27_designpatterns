package pl.noiseapps.patterns.proxy;

public class TimeLoggingProxy implements Calculator {

    private final Calculator calculator;

    public TimeLoggingProxy(CachingCalculatorProxy calculator) {
        this.calculator = calculator;
    }

    @Override
    public String generateHeavyString() {
        System.out.println("Starting TimeLoggingProxy");
        long start = System.currentTimeMillis();
        String value = calculator.generateHeavyString();
        long end = System.currentTimeMillis();
        System.out.println("TimeLoggingProxy: " + (end-start) + "ms");
        return value;
    }
}
