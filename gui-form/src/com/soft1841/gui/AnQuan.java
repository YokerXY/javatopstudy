package com.soft1841.gui;

import javax.swing.*;

public class AnQuan {
    private JPanel mainPanel;
    private JPanel topPanel;
    private JPanel leftPanel;
    private JLabel dLabel;
    private JButton 实用工具Button;
    private JButton 我的工具Button;
    private JButton 游戏优化Button;
    private JButton 系统工具Button;
    private JButton 数据安全Button;
    private JButton 网络优化Button;

    public static void main(String[] args)  throws  Exception{
        String lookAndFeel = UIManager.getSystemLookAndFeelClassName();
        UIManager.setLookAndFeel(lookAndFeel);
        JFrame frame = new JFrame("AnQuan");
        frame.setContentPane(new AnQuan().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
