package com.tank.design_pattern.fram;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Auther: xuli
 * @Description: init frame and new a frame window
 * @Date: 2024-03-05
 */
public class InitFrame {

    public static void main(String[] args) {
        Frame f  = new Frame();
        // set window's size
        f.setSize(800,600);
        // 窗口是否可以改变大小
        f.setResizable(false);
        // title
        f.setTitle("tank war");
        f.setVisible(true);

        // addWindowListener->添加window的监听器
        // WindowAdapter implements WindowListener, WindowStateListener, WindowFocusListener
        f.addWindowListener(new WindowAdapter() {
            // WindowAdapter匿名类，需要重写方法
            @Override
            public void windowClosing(WindowEvent e) {
                // 窗口关闭 ing
                System.exit(0);
            }
            /*@Override
            public void windowOpened(WindowEvent e) {
                //
                System.exit(0);
            }*/
        });
    }
}

