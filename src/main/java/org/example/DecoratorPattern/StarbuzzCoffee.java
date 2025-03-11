package org.example.DecoratorPattern;

import org.example.DecoratorPattern.Beverages.Espresso;
import org.example.DecoratorPattern.Beverages.HouseBlend;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
