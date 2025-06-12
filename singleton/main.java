// Program Question   :Create a Java Singleton class
// The singleton pattern is a design pattern that restricts the instantiation of an object to only one instance. To do this, you’ll need to create a Singleton class that has a non-parameterized constructor.

// The class should have one public variable called str. It should also have a static method called getSingleInstance that’ll return the single instance of the class

class Singleton {
    private static Singleton singleInstance = null;
 
    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }
};

class main{
    public static void main(String[] args) {
        Singleton instance = Singleton.getSingleInstance();
        
        Singleton anotherInstance = Singleton.getSingleInstance();
        
        System.out.println("Are both instances the same? " + (instance == anotherInstance));
    }
}