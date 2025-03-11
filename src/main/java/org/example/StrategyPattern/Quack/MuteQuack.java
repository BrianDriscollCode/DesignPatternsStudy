package org.example.StrategyPattern.Quack;

import org.example.StrategyPattern.Quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack()
    {
        System.out.println("<<SILENCE>>");
    }
}
