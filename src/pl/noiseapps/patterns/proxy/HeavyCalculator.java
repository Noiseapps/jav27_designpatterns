package pl.noiseapps.patterns.proxy;

public class HeavyCalculator implements Calculator {

    @Override
    public String generateHeavyString() {
        try {
            System.out.println("Start generating heavy String");
            Thread.sleep(1000);
            System.out.println("Heavy string generated");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Some heavy String";
    }
}
