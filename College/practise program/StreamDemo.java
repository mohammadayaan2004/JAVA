import java.io.*;

public class StreamDemo {
    public static void main(String[] args) {
        // Byte Stream Example
        try (FileOutputStream fos = new FileOutputStream("byteExample.txt")) {
            fos.write("This is a Byte Stream example.".getBytes());
        } catch (IOException e) {
            System.out.println("Byte Stream Error: " + e.getMessage());
        }

        // Character Stream Example
        try (FileWriter writer = new FileWriter("charExample.txt")) {
            writer.write("This is a Character Stream example.");
        } catch (IOException e) {
            System.out.println("Character Stream Error: " + e.getMessage());
        }
    }
}
