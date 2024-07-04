Animal is the base class with a method eat().
Dog is the derived class that inherits from Animal and adds a new method bark().
In the Main class, an object of the Dog class is created, 
and both the eat() method from the base class and the bark() 
method from the derived class are called, demonstrating inheritance.

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// Base class
class Animal {
    // Method in the base class
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class inheriting from the base class
class Dog extends Animal {
    // Method in the derived class
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class to demonstrate inheritance
public class Main {
    public static void main(String[] args) {
        // Create an object of the derived class
        Dog myDog = new Dog();
        
        // Call methods from both the base and derived classes
        myDog.eat();  // Method from the base class
        myDog.bark(); // Method from the derived class
    }
}




--------------------------------------------------------------------------------
    // Base class
class Vehicle {
    // Method in the base class
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

// Derived class inheriting from the base class
class Car extends Vehicle {
    // Method in the derived class
    void drive() {
        System.out.println("Car is driving.");
    }
}

// Main class to demonstrate inheritance
public class Main {
    public static void main(String[] args) {
        // Create an object of the derived class
        Car myCar = new Car();
        
        // Call methods from both the base and derived classes
        myCar.start();  // Method from the base class
        myCar.drive();  // Method from the derived class
    }
}


-------------------------------------------------------------------------

// Base class
class Person {
    // Method in the base class
    void walk() {
        System.out.println("Person is walking.");
    }
}

// Derived class inheriting from the base class
class Employee extends Person {
    // Method in the derived class
    void work() {
        System.out.println("Employee is working.");
    }
}

// Main class to demonstrate inheritance
public class Main {
    public static void main(String[] args) {
        // Create an object of the derived class
        Employee myEmployee = new Employee();
        
        // Call methods from both the base and derived classes
        myEmployee.walk();  // Method from the base class
        myEmployee.work();  // Method from the derived class
    }
}
    
