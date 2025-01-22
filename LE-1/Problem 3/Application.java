
class Mother {
    int x = 10;

    static void show() {
        System.out.println("Hello World !");
    }
}


class Child extends Mother {
   
    // @Override
    static void show() {
        System.out.println("Hello JUET !");
    }
}
class Application {
    public static void main(String args[]) {
        
        Mother meow = new Mother();
        meow.show(); 
        Child kitten = new Child();
        kitten.show(); 
         Mother m1 = new Child();
         m1.show();  //Prints out Hello JUET ! when only Mother show is static : show() in Child
         //              cannot override show() in Mother and when only Child is static :
         //              static methods cannot be annotated with @Override.
         
         // Only works when both are static or non static.
         
        
        
    }
}
