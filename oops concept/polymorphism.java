class parent {
    void print(int a) {
        System.out.println("Parent class print method");
    }

    void print(float a) {
        System.out.println("Parent class print method");
    }

    void display() {
        System.out.println("Parent class display method");
    }
}


class child extends parent {
    @Override
    void display() {
        System.out.println("Child class display method");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        parent p = new parent();
        p.print(10); 
        p.print(10.5f); 
        p.display(); // 

        child c = new child();
        c.print(20);
        c.print(20.5f); 
        c.display(); 
    }
}