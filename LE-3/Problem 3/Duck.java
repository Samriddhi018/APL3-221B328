
public abstract class Duck implements Swimmable {
    String name;

    Duck(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }
}