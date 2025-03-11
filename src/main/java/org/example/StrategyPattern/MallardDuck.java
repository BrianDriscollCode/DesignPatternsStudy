package org.example.StrategyPattern;

import org.example.StrategyPattern.Fly.FlyWithWings;
import org.example.StrategyPattern.Quack.MuteQuack;

public class MallardDuck extends Duck {
    public MallardDuck()
    {
        flyBehavior = new FlyWithWings();
        quackBehavior = new MuteQuack();
    }
}
