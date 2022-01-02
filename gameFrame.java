import java.awt.*;
import javax.swing.*;

public class gameFrame extends JFrame{
    //window of game

    GamePanel panel;

    gameFrame(){
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong game");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}