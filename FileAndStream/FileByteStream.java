package FileAndStream;
import java.io.*;

class FileByteStream {
    
    // Write bytes to file
    public static void writeToFile(String fileName, String content) {
        try (FileOutputStream fout = new FileOutputStream(fileName)) {
            fout.write(content.getBytes());
            System.out.println("Data Written Successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Read bytes from file
    public static void readFromFile(String fileName) {
        try (FileInputStream fin = new FileInputStream(fileName)) {
            int data;
            System.out.println("File Content:");
            while ((data = fin.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String file = "ByteStreamFile.txt";
        writeToFile(file, "My Name is Baburam Shrestha");
        readFromFile(file);
    }
}