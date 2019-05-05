package com.study.exercise4;

/**
 * @许源 2019年3月10日
 *实现唱歌移动
 */
public class Spirit {
    public static void main(String[] args) {
        MoveApp moveApp = new MoveApp();
        SingApp singApp = new SingApp();
        System.out.println("精灵们一边" + singApp.sing() + "，一边" + moveApp.move());

    }
}
