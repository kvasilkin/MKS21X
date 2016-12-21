
import javax.swing.*;
import java.awt.*;
public class Window2 extends JFrame implements ActionListener {
 private Container pane;

    private JButton CtoF, FtoC;
 private JLabel l;
    private JTextField Fahrs, Cels;

 
  //CONSTRUCTOR SETS EVERYTHING UP
  public Window2() {
     this.setTitle("My first GUI");
     this.setSize(600,400);
     this.setLocation(100,100);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
     pane = this.getContentPane();
     pane.setLayout(new FlowLayout());  //NOTE!! THIS CAN BE CHANGED (see below)
    
     CtoF = new JButton("Convert C to F");
FtoC = new JButton("Convert F to C");
     l = new JLabel("This is AWESOME! (lies)",null,JLabel.CENTER);
     Fahrs = new JTextField(12);
Cels = new JTextField(12);
  
     pane.add(l);
     pane.add(b);
     pane.add(t);
     pane.add(c);
 }

  //MAIN JUST INSTANTIATES + MAKE VISIBLE
  public static void main(String[] args) {
     Window2 g = new Window2();
     g.setVisible(true);
  }
}
