package com.study.exercise3;

/**
 * @许源 2019年3月10日
 *定义圆形的计算方法
 */
public class Circle extends Shape {
    public Circle(){
        super();
    }
    public  Circle(double x,double y){
        super(x,y);
    }
    @Override
    public void show(){
        System.out.println("圆形的面积；");
    }
    @Override
    public double getArea(){
        return super.x *super.y * super.x;
    }
}
