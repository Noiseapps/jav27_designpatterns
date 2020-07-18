package pl.noiseapps.patterns.builder;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {

    private final Dough dough;
    private final List<Topping> toppings = new ArrayList<>();
    private final List<Sauce> sauces = new ArrayList<>();

    public static PizzaBuilder margherita(Dough dough) { // factory method
        PizzaBuilder builder = new PizzaBuilder(dough);
        builder.addTopping(Topping.CHEESE);
        builder.addSauce(Sauce.MILD);
        return builder;
    }

    private PizzaBuilder(Dough dough) {
        this.dough = dough;
    }

    PizzaBuilder addTopping(Topping topping) {
        toppings.add(topping);
        return this;
    }

    PizzaBuilder addSauce(Sauce sauce) {
        sauces.add(sauce);
        return this;
    }

    Pizza build() {
        return new Pizza(dough, toppings, sauces);
    }
}
