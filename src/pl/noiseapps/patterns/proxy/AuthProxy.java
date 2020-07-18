package pl.noiseapps.patterns.proxy;

public class AuthProxy implements Calculator {

    private final Calculator calculator;

    public AuthProxy(TimeLoggingProxy calculator) {
        this.calculator = calculator;
    }

    @Override
    public String generateHeavyString() {
        if(AuthContext.getInstance().isUserAuthorized()) {
            return calculator.generateHeavyString();
        } else {
            System.out.println("User not permitted");
            return null;
        }
    }
}
