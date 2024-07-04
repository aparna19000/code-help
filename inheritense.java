// Base class
class Vehicle {
    // Properties of the base class
    String brand;
    int year;
    
    // Constructor of the base class
    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    
    // Method in the base class
    void start() {
        System.out.println("Vehicle is starting.");
    }
    
    // Method to display vehicle details
    void displayDetails() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

// Derived class inheriting from the base class
class Car extends Vehicle {
    // Additional property of the derived class
    int numberOfDoors;
    
    // Constructor of the derived class
    Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }
    
    // Method in the derived class
    void drive() {
        System.out.println("Car is driving.");
    }
    
    // Overriding method to display car details
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Another derived class inheriting from the base class
class Bike extends Vehicle {
    // Additional property of the derived class
    boolean hasCarrier;
    
    // Constructor of the derived class
    Bike(String brand, int year, boolean hasCarrier) {
        super(brand, year);
        this.hasCarrier = hasCarrier;
    }
    
    // Method in the derived class
    void ride() {
        System.out.println("Bike is riding.");
    }
    
    // Overriding method to display bike details
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Has Carrier: " + hasCarrier);
    }
}

// Main class to demonstrate inheritance
public class Main {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car("Toyota", 2020, 4);
        myCar.start();  // Method from the base class
        myCar.drive();  // Method from the derived class
        myCar.displayDetails();  // Overridden method from the derived class
        
        System.out.println();
        
        // Create an object of the Bike class
        Bike myBike = new Bike("Honda", 2021, true);
        myBike.start();  // Method from the base class
        myBike.ride();   // Method from the derived class
        myBike.displayDetails();  // Overridden method from the derived class
    }
}


In this enhanced example:

Vehicle is the base class with properties brand and year, a constructor, and methods start() and displayDetails().
Car is a derived class that extends Vehicle, adds a new property numberOfDoors, a constructor, and overrides the displayDetails() method.
Bike is another derived class that extends Vehicle, adds a new property hasCarrier, a constructor, and overrides the displayDetails() method.
The Main class demonstrates the use of both the Car and Bike classes, showcasing the functionality of the base class and the derived classes, including overridden methods and additional properties.
