package pl.noiseapps.patterns.proxy;

public class AuthContext {

    private final static AuthContext instance = new AuthContext();

    public static AuthContext getInstance() {
        return instance;
    }

    private int userId;

    public void setUserId(int userId) {
        this.userId = userId;
    }

    boolean isUserAuthorized() {
        return userId > 50;
    }
}
