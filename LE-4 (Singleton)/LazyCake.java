public class LazyCake {
    
    private static LazyCake cake;

    private LazyCake() {}

    public synchronized static LazyCake getCake() {
        if (cake == null) {
            cake = new LazyCake();
        }
        return cake;
    }
}
