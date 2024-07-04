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
