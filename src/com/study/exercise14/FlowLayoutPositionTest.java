package com.study.exercise14;
import javax.swing.*;
import java.awt.*;
/**
 * 流布局的使用
 * @author 许源
 * 2019年3月25日
 */
public class FlowLayoutPositionTest extends JFrame {
    public FlowLayoutPositionTest(){
        setTitle("流布局的使用");
        Container c =getContentPane();
        setLayout( new FlowLayout(FlowLayout.CENTER,10,10));
        JLabel jLabel = new JLabel("下面四句诗，哪一个是描写夏天的？");
        c.add(jLabel);
        JLabel jLabe2= new JLabel("A.秋风萧瑟天气凉，树木摇荡露为霜。");
        c.add(jLabe2);
        JLabel jLabe3 = new JLabel("B.白雪纷纷何所似，撒盐空中差可似。");
        c.add(jLabe3);
        JLabel jLabe4 = new JLabel("C.接天莲叶无穷碧，映日荷花别样红。");
        c.add(jLabe4);
        JLabel jLabe5 = new JLabel("D.竹外桃花两三枝，春江水暖鸭先知。");
        c.add(jLabe5);
        setSize(300,300);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        new FlowLayoutPositionTest();
    }
}
