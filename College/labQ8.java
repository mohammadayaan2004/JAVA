import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class labQ8 {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        // Try-with-resources to ensure streams are closed after the operation
        try (FileInputStream inputFile = new FileInputStream(sourceFile);
             FileOutputStream outputFile = new FileOutputStream(destinationFile)) {

            int data;
            // Read byte by byte from source and write it to destination
            while ((data = inputFile.read()) != -1) {
                outputFile.write(data);
            }

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
