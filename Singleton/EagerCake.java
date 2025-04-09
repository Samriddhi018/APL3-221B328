public class EagerCake {
    
    private static final EagerCake cake = new EagerCake();

    private EagerCake() {}

    public static EagerCake getCake() {
        return cake;
    }
}
