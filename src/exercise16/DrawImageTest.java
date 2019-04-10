package exercise16;

import javax.swing.*;
import java.awt.*;

/**
 * 在窗体中绘制图像
 * @author 许源
 * 2019.4.11
 */
public class DrawImageTest extends JFrame {
    public DrawImageTest(){
        this.setSize(1580,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new CanvasTest());
        this.setTitle("绘制图像");
    }

    public static void main(String[] args) {
        new DrawImageTest().setVisible(true);
    }

    class CanvasTest extends Canvas {
        public void paint(Graphics g){
            super.paint(g);
            Graphics2D g2 = (Graphics2D) g;
            Image img = new ImageIcon(this.getClass().getResource("/exercise16/img/1.jpg")).getImage();
            g2.drawImage(img,0,0,this);
        }
    }
}
