
public class LakeDuck extends Duck implements Flyable, Quackable {
    LakeDuck(String name) {
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