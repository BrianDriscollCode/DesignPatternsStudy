package org.example.StrategyPattern;

import org.example.StrategyPattern.Fly.FlyBehavior;
import org.example.StrategyPattern.Quack.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    public void performFly()
    {
        flyBehavior.fly();
    }

    QuackBehavior quackBehavior;
    public void performQuack()
    {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb)
    {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb)
    {
        quackBehavior = qb;
    }


}
