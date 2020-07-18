package pl.noiseapps.patterns.builder;

import java.util.List;

public class Pizza {

    private final Dough dough;
    private final List<Topping> toppings;
    private final List<Sauce> sauces;

    public Pizza(Dough dough, List<Topping> toppings, List<Sauce> sauces) {
        this.dough = dough;
        this.toppings = toppings;
        this.sauces = sauces;
    }

    public void bake() {
        System.out.println("Pizza " + toString() + " is being baked");
        try {
            Thread.sleep(1000);
            System.out.println("Pizza is ready to eat");
        } catch (InterruptedException e) {
            System.out.println("Pizza disappeared in the oven");
        }

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough=" + dough +
                ", toppings=" + toppings +
                ", sauces=" + sauces +
                '}';
    }
}
