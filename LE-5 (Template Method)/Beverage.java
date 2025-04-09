abstract class Beverage{
    private void pour(int qty){
        System.out.println("pour " + qty + " ml of beverage in a glass ");
    }
    abstract void addCondiments();
    abstract protected void stir();
    private void serve(){
        System.out.println("Server through waiter");
    }
    public void templateMethod(int qty){
    pour(qty);
    addCondiments();
    stir();
    serve();
}
}