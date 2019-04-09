package exercise16;


import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawLineThread implements Runnable {
    int x = 0;
    int y = 700;
    private JFrame frame;
    private Color[] colors = {Color.WHITE, Color.BLUE, Color.YELLOW, Color.CYAN, Color.PINK, Color.RED
            , Color.ORANGE, Color.MAGENTA, Color.GRAY};

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Graphics graphics = frame.getGraphics();
            graphics.setColor(colors[random.nextInt(colors.length)]);
            graphics.drawLine(x, y, 200, 300);
            x += 20;
            if (x >= 1000) {
                break;
            }
        }
    }
}

