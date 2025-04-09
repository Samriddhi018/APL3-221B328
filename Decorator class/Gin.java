class Gin extends Decorator{
    Gin(Offering offering){
        this.offering = offering;
    }
String getName(){
    return offering.getName() + " 'o Gin";
}
int getPrice(){
    return offering.getPrice() + 45;
}
}