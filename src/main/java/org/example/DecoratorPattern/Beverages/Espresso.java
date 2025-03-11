package org.example.DecoratorPattern.Beverages;

import org.example.DecoratorPattern.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost()
    {
        return 1.99;
    }
}
