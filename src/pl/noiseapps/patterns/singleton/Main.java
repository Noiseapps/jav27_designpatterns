package pl.noiseapps.patterns.singleton;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        new Thread(runnable()).start();
        new Thread(runnable()).start();
        new Thread(runnable()).start();
        new Thread(runnable()).start();

//        Thread.sleep(1000);
//        System.out.println(EagerSingleton.getInstance().toString());
//        LazySingleton s1 = LazySingleton.getInstance();
//        LazySingleton s2 = LazySingleton.getInstance();
//        LazySingleton s3 = LazySingleton.getInstance();
//
//        System.out.println(s1.toString());
//        System.out.println(s2.toString());
//        System.out.println(s3.toString());
    }

    private static Runnable runnable() {
        return new Runnable() {
            @Override
            public void run() {
                DoubleCheckLocking s1 = DoubleCheckLocking.getInstance();
                System.out.println(s1.toString());
            }
        };
    }

}
