package pl.noiseapps.patterns.proxy;

public class CachingCalculatorProxy implements Calculator {

    private final HeavyCalculator calculator;
    private String cachedValue;

    public CachingCalculatorProxy(HeavyCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public String generateHeavyString() {
        System.out.println("Start CachingProxy");
        if (cachedValue == null) {
            System.out.println("Cache miss, executing original method");
            cachedValue = calculator.generateHeavyString();
            System.out.println("Cache filled");
        } else {
            System.out.println("Cache hit, returning cached value");
        }
        return cachedValue;
    }
}
