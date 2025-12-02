public class Polymorphism {
    // Compile-time polymorphism: method overloading
    static class Adder {
        int add(int a, int b) { 
            return a + b; 
        }
        double add(double a, double b) { 
            return a + b; 
        }
        String add(String a, String b) { 
            return a + b; 
        } // String concatenation uses '+'
    }

    // Constructor overloading
    static class Person {
        String name;
        Person() {
            this.name = "Unknown"; 
        }
        Person(String name) { 
            this.name = name; 
        }
        void info() { 
            System.out.println("Person: " + name); 
        }
    }

    // Runtime polymorphism: method overriding
    static class Animal {
        void speak() { 
            System.out.println("Animal speaks");
        }
    }
    static class Dog extends Animal {
        @Override
        void speak() { 
            System.out.println("Dog barks"); 
        }
    }

    // Interface polymorphism
    interface Shape { 
        void draw(); 
    }
    static class Circle implements Shape { 
        public void draw() { 
            System.out.println("Drawing Circle"); 
        } 
    }
    static class Square implements Shape { 
        public void draw() {
            System.out.println("Drawing Square"); 
        } 
    }

    public static void main(String[] args) {
        Polymorphism p = new Polymorphism();

        // Overloading
        Adder ad = new Adder();
        System.out.println("int add: " + ad.add(2, 3));
        System.out.println("double add: " + ad.add(2.5, 3.1));
        System.out.println("String add: " + ad.add("Hello, ", "world!"));

        // Constructor overloading
        Person p1 = new Person();
        Person p2 = new Person("Alice");
        p1.info();
        p2.info();

        // Overriding / runtime polymorphism
        Animal a = new Dog(); // upcast
        a.speak(); // Dog's speak() runs
        Animal ani = new Animal();
        ani.speak();

        // Interface polymorphism
        Shape s = new Circle();
        s.draw();
        s = new Square();
        s.draw();
    }
}
