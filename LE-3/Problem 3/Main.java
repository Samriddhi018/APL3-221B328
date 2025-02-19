
public class Main {
    public static void main(String[] args) {
        RubberDuck rd = new RubberDuck("Rubber Duck");
        WoodenDuck wd = new WoodenDuck("Wooden Duck");
        RedHeadDuck rhd = new RedHeadDuck("RedHead Duck");
        LakeDuck ld = new LakeDuck("Lake Duck");

        rd.swim();
        rd.squeak();
        
        wd.swim();
        
        rhd.swim();
        rhd.fly();
        rhd.quack();
        
        ld.swim();
        ld.fly();
        ld.quack();
    }
}