package FileAndStream;
import java.io.*;

public class FileCharacterStream {
    // Write to file using FileWriter
    public static void writeToFile(String fileName, String content) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Data written successfully!");
        }
    }
    // Read from file using FileReader
    public static void readFromFile(String fileName) throws IOException {
        try (FileReader reader = new FileReader(fileName)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        String file = "CharacterStreamFile.txt";
        writeToFile(file, "Baburam Shrestha\nWelcome to Java File Handling!");
        readFromFile(file);
        System.out.println("\n---");
    }
}
