package org.example.StrategyPattern.Fly;

public class FlyRocketPowered implements org.example.StrategyPattern.Fly.FlyBehavior {
    public void fly()
    {
        System.out.println("I'm flying with a rocket!!!");
    }
}
