import java.awt.*;
import java.util.*;

public class ball extends Rectangle{

    Random rand;
    int xVelocity;
    int yVelocity;
    int initial_speed = 2;

    public ball(int x, int y, int width, int height){
        super(x , y, width, height);
        rand = new Random();
        int randomXDir = rand.nextInt(2);
        
        if(randomXDir == 0){
            randomXDir--;
        }
        setXDirection(randomXDir*initial_speed);

        int randomYDir = rand.nextInt(2);
        if(randomYDir == 0){
            randomYDir--;
        }
        setYDirection(randomYDir*initial_speed);
    }

    public void setYDirection(int randY){
        yVelocity = randY;
    }

    public void setXDirection(int randX){
        xVelocity = randX;
    }

    public void move(){
        x+=xVelocity;
        y+=yVelocity;
    }

    public void draw(Graphics g){
        g.setColor(Color.white);
        g.fillOval(x, y, width, height);
    }
}