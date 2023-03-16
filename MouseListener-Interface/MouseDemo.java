import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;


public class MouseListenerDemo implements MouseListener{
JLabel lbl1, lbl2;
JFrame fr;
JPanel panel;
String s;
public MouseListenerDemo(){
fr = new JFrame ("Java MouseListener Example");
fr.setSize(400,400);
lbl1 = new JLabel ("Demo for the MouseListener", JLabel.CENTER);
lbl2 = new JLabel ("", JLabel.CENTER);

fr.setLayout(new GridLayout (3,1));
fr.add(lbl1);
fr.add(lbl2);
fr.addMouseListener(this);
fr.setVisible(true);
}
  
public void mouseEntered(MouseEvent e) {
s = "JESSE WE NEED TO COOK";
lbl2.setText(s);
lbl2.setForeground(Color.BLACK);
}
public void MouseExited(MouseEvent e) {
  s = "You are the protagonist of your life";
  lbl2.setText(s);
  lbl2.setForeground(Color.RED);
}
  
public void mousePressed(MouseEvent e) {
  s = "Will it click or will it release?";
  lbl2.setText(s);
  fr.getContentPane().setBackground(Color.GREEN);
}
  public void mouseReleased(MouseEvent e) {
    s = "I've been released!";
    lbl2.setText(s);
    lbl2.setForeground(Color.BLUE);
  }
}