import java.awt.*;
import java.awt.event.*;
public class paddle extends Rectangle{

    int id;
    int yVelocity;
    int speed = 10;
    

    paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id){
        super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        this.id = id;
    }

    public void keyPressed(KeyEvent e){

        switch(id){
            case 1:
                if(e.getKeyCode() == KeyEvent.VK_W){
                    setYDirection(-speed);
                    move();
                }
                if(e.getKeyCode() == KeyEvent.VK_S){
                    setYDirection(speed);
                    move();
                }
                break;
            case 2:
                if(e.getKeyCode() == KeyEvent.VK_DOWN){
                    setYDirection(speed);
                    move();
                }
                if(e.getKeyCode() == KeyEvent.VK_UP){
                    setYDirection(-speed);
                    move();
                }
                break;
        }

    }

    public void keyReleased(KeyEvent e){
        switch(id){
            case 1:
                if(e.getKeyCode() == KeyEvent.VK_W){
                    setYDirection(0);
                    move();
                }
                if(e.getKeyCode() == KeyEvent.VK_S){
                    setYDirection(0);
                    move();
                }
                break;
            case 2:
                if(e.getKeyCode() == KeyEvent.VK_DOWN){
                    setYDirection(0);
                    move();
                }
                if(e.getKeyCode() == KeyEvent.VK_UP){
                    setYDirection(0);
                    move();
                }
                break;
        }

    }

    public void setYDirection(int yDir){
        yVelocity = yDir;
    }

    public void move(){
        super.y = super.y + yVelocity;
    }

    public void Draw(Graphics g){
        if(id == 1){
            g.setColor(Color.blue);
        }
        else{
            g.setColor(Color.red);
        }

        g.fillRect(super.x, super.y, super.width, super.height);
    }
}