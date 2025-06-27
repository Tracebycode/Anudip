import java.util.Scanner;

public class car {
    String make;
    String model;
    short year;
    int price;

    public car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void displayCarDetails() {
        System.out.println("Car Details:");
        System.out.println("Make  : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
        System.out.println("Price : ₹" + price);
       
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of cars you want to create: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        car[] cars = new car[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details for Car #" + (i + 1));
            System.out.print("Enter make: ");
            String make = scanner.nextLine();
            System.out.print("Enter model: ");
            String model = scanner.nextLine();
            System.out.print("Enter year: ");
            short year = scanner.nextShort();
            System.out.print("Enter price: ");
            int price = scanner.nextInt();
            scanner.nextLine();
            cars[i] = new car(make, model, year, price);
        }

        System.out.println("\nAll Car Objects:");
        for (car car : cars) {
            car.displayCarDetails();
        }

        scanner.close();
    }
}
