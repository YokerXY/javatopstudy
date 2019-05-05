package com.study.exercise2;

/**
 * 使用接口类实现特殊的图形
 * @许源 2019年3月10日
 */
public class SpecialParallelogram {   //定义特殊的平行四边形
    public static void main(String[] args) {
        //接口也可以进行向上转型操作
        DrawImage[] images ={new Retangle(),new Square(),new Diamond()};
        //遍历“画图形”接口类型的数组
        for (int i = 0; i<images.length;i++){
            images[i].draw();     //调用draw方法
        }
    }
}
