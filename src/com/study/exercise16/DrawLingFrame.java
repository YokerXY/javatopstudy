package com.study.exercise16;


import javax.swing.*;
import java.awt.*;
/**
 * 给窗口绘制线条
 * @author 许源
 * 2019.4.10
 */
public class DrawLingFrame extends JFrame {
    public DrawLingFrame(){
        Init();
        setTitle("彩绘彩色线段");
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private void Init(){
        getContentPane().setBackground(new Color(0,0,0));
        DrawLineThread drawLineThread = new DrawLineThread();
        drawLineThread.setFrame(this);
        new Thread(drawLineThread).start();
    }

    public static void main(String[] args) {
        new DrawLingFrame();
    }
}
