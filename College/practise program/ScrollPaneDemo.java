import java.awt.*;

public class ScrollPaneDemo {
    ScrollPaneDemo() {
        Frame frame = new Frame("Scroll Pane Example");
        ScrollPane scrollPane = new ScrollPane();

        TextArea textArea = new TextArea("This is a scrollable text area.");
        scrollPane.add(textArea);

        frame.add(scrollPane);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ScrollPaneDemo();
    }
}
