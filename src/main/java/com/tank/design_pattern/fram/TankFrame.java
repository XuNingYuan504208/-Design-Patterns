package com.tank.design_pattern.fram;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Description:
 * @Author: NY
 * @Date: 3/6/24
 **/
public class TankFrame extends Frame {
    int x = 200 , y= 200;

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
        System.out.println("paint function ...");
        g.fillRect(x,y,50,50);
//        x+=10;
//        y+=10;
    }

    // 内部类
    class MyKeyListener extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
//            System.out.println("key pressed ...");
//            x+=200;
            // 刷新窗口
//            repaint();
            int keyCode = e.getKeyCode();
            switch (e.getKeyCode()){
                case KeyEvent.VK_LEFT:
                    x -= 10;
                    break;
                case KeyEvent.VK_UP:
                    y -= 10;
                    break;
                case KeyEvent.VK_RIGHT:
                    x += 10;
                    break;
                case KeyEvent.VK_DOWN:
                    y += 10;
                    break;
                default:
                    break;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("key released ...");
        }
    }
}
