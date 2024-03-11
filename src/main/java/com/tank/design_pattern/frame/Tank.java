package com.tank.design_pattern.frame;

import com.tank.design_pattern.model.enums.Direction;
import lombok.Data;

import java.awt.*;

/**
 * @Description:
 * @Author: NY
 * @Date: 3/7/24
 **/
@Data
public class Tank {
    private int x,y;
    private Direction dir = Direction.DOWN;
    private static final int SPEED = 10;
    private boolean moving ;

    public Tank(int x,int y,Direction dir){
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public void paint(Graphics g) {
        g.fillRect(x,y,50,50);
        move();
    }

    public void move(){
        if(!moving){
            return;
        }
        switch (dir){
            case LEFT:
                x -= SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            case UP:
                y -= SPEED;
                break;
            case DOWN:
                y += SPEED;
                break;
            default:
                break;
        }
    }
}
