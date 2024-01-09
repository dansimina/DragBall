import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JApplet{
    public static void main(String[] args){
//        DragDemo
        JFrame window = new JFrame();
        window.setTitle("Drag Demo");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new DragBallPanel());
        window.pack();
        window.setVisible(true);
    }

    public Main() {
        this.setContentPane(new DragBallPanel());
    }
}