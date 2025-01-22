/*
class One {
    One(int x) {
        System.out.println("Parameterized constructor of One is called with value: " + x);
    }
}
class Two extends One {
    
}  
There's an error when executing these classes because the Two class must explicitly call the
parameterized constructor of One .
*/

class One {
    One(int x) {
        System.out.println("Parameterized constructor of One, x = " + x);
    }
}

class Two extends One {
    
    Two(int x) {
        super(x); 
        System.out.println("Constructor of Two, x = " + x);
    }
}

class Application {
    public static void main(String args[]) {
        Two obj = new Two(328); 
    }
}
