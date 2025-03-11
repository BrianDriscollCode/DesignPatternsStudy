package org.example.StrategyPattern.Fly;

public class FlyNoWay implements org.example.StrategyPattern.Fly.FlyBehavior {
    public void fly()
    {
        System.out.println("I can't fly");
    }
}
