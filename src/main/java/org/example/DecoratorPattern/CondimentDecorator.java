package org.example.DecoratorPattern;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;
    public abstract String getDescription();
}
