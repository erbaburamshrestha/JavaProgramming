package FileAndStream;
import java.io.*;

public class SerilizationAndDeserilization {
    // Example Serializable class
    static class Person implements Serializable {
        private static final long serialVersionUID = 1L;
        private String name;
        private int age;
        
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        @Override
        public String toString() {
            return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
        }
    }
    
    // Serialize object to file
    public static void serializeObject(Object obj, String filename) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(filename);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(obj);
            System.out.println("Object serialized successfully");
        }
    }
    
    // Deserialize object from file
    public static Object deserializeObject(String filename) throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream(filename);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return ois.readObject();
        }
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("Baburam", 25);
        String filename = "person.ser";
        
        serializeObject(person, filename);
        Person deserializedPerson = (Person) deserializeObject(filename);
        System.out.println("Deserialized: " + deserializedPerson);
    }
}
