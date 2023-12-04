import javax.swing.*;

public class App extends JFrame {
    public static void main(String[] args) throws Exception {
        CalPanel Cal = new CalPanel();
        JFrame MainFrame = new JFrame();

        MainFrame.add(Cal);
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets the default close operation to exit the application when the frame is closed.
        MainFrame.setResizable(false);                  // disables the ability to resize the frame.
        MainFrame.setTitle("Calculator");                   // sets the title of the frame to "Calculator".
        MainFrame.setSize(514, 760);                 // sets the size of the frame to 514 pixels wide and 760 pixels tall.
        MainFrame.setVisible(true);                             // makes the frame visible.
        MainFrame.setLayout(null);                        // sets the layout manager of the frame to null, indicating that you'll manually specify the position and size of the components.
        MainFrame.setLocationRelativeTo(null);                  // positions the frame at the center of the screen.
    }
}
    