

class parent{
    private int a;
    private int b;

    void set(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void get() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
    
}

class encapsulation{
    public static void main(String[] args) {
        parent p = new parent();
        p.set(10, 20);
        p.get();
    }
}
