import java.awt.*;

public class labQ12 {
    public static void main(String[] args) {
        // Create a new frame
        Frame frame = new Frame("Hello World");

        // Create a label with the text "Hello World"
        Label label = new Label("Hello World");

        // Add the label to the frame
        frame.add(label);

        // Set the size of the frame`
        frame.setSize(300, 100);

        // Make the frame visible
        frame.setVisible(true);
    }
}

