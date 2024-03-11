package com.tank.design_pattern.frame;

import com.tank.design_pattern.model.enums.Direction;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static com.tank.design_pattern.model.enums.Direction.*;

/**
 * @Description:
 * @Author: NY
 * @Date: 3/6/24
 **/
public class TankFrame extends Frame {
    private static final int SPEED = 10;
//    int x = 200 , y= 200;
//    Direction dir = Direction.DOWN;

    // 面向对象的封装过程
    Tank myTank = new Tank(200,200,Direction.DOWN);
    Tank yTank = new Tank(200,200,Direction.DOWN);

    public TankFrame() {
        setSize(800, 600);
        setResizable(false);
        setTitle("tank war");
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            // WindowAdapter匿名类，需要重写方法
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // 键盘监听
        addKeyListener(new MyKeyListener());

    }

    @Override
    public void paint(Graphics g) {
        myTank.paint(g);
//        System.out.println("paint function ...");
        /*g.fillRect(x,y,50,50);
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
        }*/
//        x+=10;
//        y+=10;
    }

    // 内部类
    class MyKeyListener extends KeyAdapter{
        boolean bL;
        boolean bU;
        boolean bR;
        boolean bD;

        // 斜着走根据按下的key，设置成BL/BU/BR/BD = true
        // key released set false
        @Override
        public void keyPressed(KeyEvent e) {
//            System.out.println("key pressed ...");
//            x+=200;
            // 刷新窗口
//            repaint();
            int keyCode = e.getKeyCode();
            switch (e.getKeyCode()){
                case KeyEvent.VK_LEFT:
//                    x -= 10;
                    bL = true;
                    break;
                case KeyEvent.VK_UP:
//                    y -= 10;
                    bU = true;
                    break;
                case KeyEvent.VK_RIGHT:
//                    x += 10;
                    bR = true;
                    break;
                case KeyEvent.VK_DOWN:
//                    y += 10;
                    bD = true;
                    break;
                default:
                    break;
            }

            setMainTankDir();
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("key released ...");
            switch (e.getKeyCode()){
                case KeyEvent.VK_LEFT:
//                    x -= 10;
                    bL = false;
                    break;
                case KeyEvent.VK_UP:
//                    y -= 10;
                    bU = false;
                    break;
                case KeyEvent.VK_RIGHT:
//                    x += 10;
                    bR = false;
                    break;
                case KeyEvent.VK_DOWN:
//                    y += 10;
                    bD = false;
                    break;
                default:
                    break;
            }
            setMainTankDir();
        }


        /**
         * 设置方向
         */
        private void setMainTankDir() {
            if(bL) {
//                dir = LEFT;
                myTank.setDir(LEFT);
            }
            if(bR) {
//                dir = RIGHT;
                myTank.setDir(RIGHT);
            }
            if(bU) {
//                dir = Direction.UP;
                myTank.setDir(UP);
            }
            if(bD) {
//                dir = Direction.DOWN;
                myTank.setDir(DOWN);
            }
        }
    }
}
