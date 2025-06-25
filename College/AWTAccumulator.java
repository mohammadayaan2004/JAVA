import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces

// An AWT GUI program inherits (customized) from the top-level container
//   java.awt.Frame
public class AWTAccumulator extends Frame {
   //private Label lblInput;   // Declare input Label (to use anonymous)
   //private Label lblOutput;  // Declare output Label (to use anonymous)
   private TextField tfInput;  // Declare input TextField
   private TextField tfOutput; // Declare output TextField
   private int sum = 0;        // Accumulated sum, init to 0

   // Constructor to setup the GUI components and event handlers
   public AWTAccumulator() {
      setLayout(new GridLayout(2, 2));
         // "super" Frame (Container) sets layout to GridLayout of 2 rows 2 columns.

      add(new Label("Enter an Integer: "));  // "super" Frame adds an anonymous Label

      tfInput = new TextField(10); // Construct TextField
      add(tfInput);                // "super" Frame adds TextField

      tfInput.addActionListener(new TFInputListener());  // anonymous instance
         // "tfInput" is the source object that fires an ActionEvent upon entered.
         // The source add an anonymous instance of TFInputListener as an ActionEvent
         //   listener, which provides an ActionEvent handler called actionPerformed().
         // Hitting "enter" on tfInput invokes actionPerformed().

      add(new Label("The Accumulated Sum is: "));  // "super" Frame adds an anonymous Label

      tfOutput = new TextField(10); // allocate TextField
      tfOutput.setEditable(false);  // read-only
      add(tfOutput);                // "super" Frame adds TextField

      setTitle("AWT Accumulator");  // "super" Frame sets title
      setSize(350, 120);  // "super" Frame sets initial window size
      setVisible(true);   // "super" Frame shows
   }

   // The entry main() method
   public static void main(String[] args) {
      // Invoke the constructor to setup the GUI, by allocating an anonymous instance
      new AWTAccumulator();
   }

   // Define an inner class to handle the input TextField.
   // An ActionEvent listener must implement ActionListener interface.
   private class TFInputListener implements ActionListener {
      // ActionEvent handler - Called back upon hitting "enter" key on TextField
      @Override
      public void actionPerformed(ActionEvent evt) {
         // Get the String entered into the TextField tfInput, convert to int
         int numberIn = Integer.parseInt(tfInput.getText());
         sum += numberIn;      // Accumulate numbers entered into sum
         tfInput.setText("");  // Clear input TextField
         tfOutput.setText(sum + ""); // Display sum on the output TextField
                                     // convert int to String
      }
   }
}