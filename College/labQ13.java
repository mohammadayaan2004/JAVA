import javax.swing.*;  // Importing Swing package

public class labQ13 {
    public static void main(String[] args) {
        // Creating a new frame (window)
        JFrame frame = new JFrame("Hello World Swing Example");
        
        // Setting the size of the frame
        frame.setSize(400, 200);
        
        // Specifying what happens when the frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating a label with "Hello World" text
        JLabel label = new JLabel("Hello World", SwingConstants.CENTER);

        // Adding the label to the frame
        frame.add(label);

        // Making the frame visible
        frame.setVisible(true);
    }
}
