// Simple class demonstrating fields, constructors, accessors, mutators, and toString
public class ClassObject {
    // unique identifier for this object
    private int id;
    // human-readable name for this object
    private String name;

    // No-argument constructor: delegates to the parameterized constructor
    // to provide default values (id=0, name="Unknown")
    public ClassObject() {
        this(
            0, 
            "Unknown"
        );
    }

    // Parameterized constructor: initializes fields with provided values
    public ClassObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter for id field
    public int getId() {
        return id;
    }

    // Setter for id field
    public void setId(int id) {
        this.id = id;
    }

    // Getter for name field
    public String getName() {
        return name;
    }

    // Setter for name field
    public void setName(String name) {
        this.name = name;
    }

    // Example usage and simple test of the class functionality
    public static void main(String[] args) {
        // create object with default values
        ClassObject obj1 = new ClassObject();
        // create object with specified id and name
        ClassObject obj2 = new ClassObject(1, "Alice");

        // print both objects (uses toString)
        System.out.println(obj1.id + ": " + obj1.name);
        System.out.println(obj2.id + ": " + obj2.name);

        // change name via setter and print updated object
        obj2.setName("Bob");
        System.out.println("After Rename: " + obj2.id + ": " + obj2.name);
    }
}
