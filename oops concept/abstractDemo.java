
abstract  class parent {
    abstract  void  display();
    
}

class child extends parent {
    @Override
    void display() {
        System.out.println("Child class display method");
    }
}

public class abstractDemo {
    public static void main(String[] args) {
        parent p = new child();
        p.display(); 
    }
}