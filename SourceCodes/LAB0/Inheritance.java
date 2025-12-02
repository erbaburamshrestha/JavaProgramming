// Base class
class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Single inheritance
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    void bark() {
        System.out.println(name + " is barking.");
    }
}

// Another derived class (Hierarchical inheritance)
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
    void meow() {
        System.out.println(name + " is meowing.");
    }
}

// Multi-level inheritance
class Puppy extends Dog {
    Puppy(String name) {
        super(name);
    }

    void whine() {
        System.out.println(name + " is whining.");
    }
}

// Main class to test inheritance
public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");
        Puppy puppy = new Puppy("Max");

        dog.eat();  // Inherited method
        dog.bark(); // Dog specific method

        cat.eat();  // Inherited method
        cat.meow(); // Cat specific method

        puppy.eat();  // Inherited method from Animal
        puppy.bark(); // Inherited method from Dog
        puppy.whine(); // Puppy specific method
    }
}
