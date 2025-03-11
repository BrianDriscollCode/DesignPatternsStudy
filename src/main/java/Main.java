import org.example.StrategyPattern.Duck;
import org.example.StrategyPattern.Fly.FlyRocketPowered;
import org.example.StrategyPattern.MallardDuck;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();

        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();
    }
}