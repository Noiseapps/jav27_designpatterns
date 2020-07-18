package pl.noiseapps.patterns.builder;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = PizzaBuilder
                .margherita(Dough.THIN)
                .addTopping(Topping.MUSHROOM)
                .addTopping(Topping.ONION)
                .addTopping(Topping.CHEESE)
                .addTopping(Topping.HAM)
                .addSauce(Sauce.MILD)
                .addSauce(Sauce.GARLIC)
                .build();

        pizza.bake();
    }
}
