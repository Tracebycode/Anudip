// Create a base class called Vehicle with the following methods: ● void start(): This method should print "Vehicle started." Create two subclasses of Vehicle called Car and Motorcycle. Override the start() method in each subclass to provide a specific implementation: ● Car: Print "Car started." ● Motorcycle: Print "Motorcycle started." Create a class called Garage with a method named serviceVehicle(Vehicle vehicle). Inside this method, call the start() method of the provided vehicle object and print "Vehicle serviced." In the Main class, create instances of Car and Motorcycle. Create an instance of the Garage class. Call the serviceVehicle() method of the Garage class with instances of both Car and Motorcycle. 

class Vehicle {
    public void start() {
        System.out.println("Vehicle started.");
    }
}
class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car started.");
    }
}
class Motorcycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle started.");
    }
}
class Garage {
    public void serviceVehicle(Vehicle vehicle) {
        vehicle.start();
        System.out.println("Vehicle serviced.");
    }
}
public class GarageServiceDemo {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();
        
        Garage garage = new Garage();
        
        garage.serviceVehicle(myCar);
        garage.serviceVehicle(myMotorcycle);
    }
}