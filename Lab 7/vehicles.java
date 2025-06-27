//  Write a Java program to create a class called Vehicle with a method called drive(). ● Vehicle should have attributes such as make (String), model (String) , year (int) and maximumSpeed (int). ● Create a constructor in Vehicle with all fields as constructor parameters. ● Create a subclass called Car and override constructor. Call super(). ● Write a function that overrides the drive() method to print (make + “ ” + model + " Car is driving". ) ● Also create another subclass Bike extending the vehicle class. ● Override the drive() method to print (make + “ ” + model + " Bike is driving". ) ● Instantiate both Bike and Car class. Print their attributes. 



class Vehicle {
    String make;
    String model;
    int year;
    int maximumSpeed;

    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    public void drive() {
        System.out.println(make + " " + model + " is driving.");
    }

   
}

class Car extends Vehicle {
    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(make + " " + model + " Car is driving.");
    }
}   

class vehicles{
    public static void main(String[] args) {
        Vehicle V1 = new Vehicle("Toyota", "Corolla", 2020, 180);
        Car C1 = new Car("Honda", "Civic", 2021,120);

        V1.drive();
        C1.drive();
        System.out.println("Make: " + V1.make + ", Model: " + V1.model + ", Year: " + V1.year + ", Max Speed: " + V1.maximumSpeed);
        System.out.println("Make: " + C1.make + ", Model: " + C1.model + ", Year: " + C1.year + ", Max Speed: " + C1.maximumSpeed);
        
    }
}