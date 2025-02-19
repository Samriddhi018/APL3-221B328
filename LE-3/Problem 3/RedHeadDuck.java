
public class RedHeadDuck extends Duck implements Flyable, Quackable {
    RedHeadDuck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + " can fly.");
    }

    @Override
    public void quack() {
        System.out.println(name + " quacks.");
    }
}