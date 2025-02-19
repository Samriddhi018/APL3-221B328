
public class RubberDuck extends Duck implements Squeakable {
    RubberDuck(String name) {
        super(name);
    }

    @Override
    public void squeak() {
        System.out.println(name + " squeaks.");
    }
}