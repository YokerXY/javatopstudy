package com.study.exercise3;

/**
 * @许源 2019年3月10日
 * 定义图形类的属性计算方法
 */
public  abstract class Shape {
    protected  double x;
    protected  double y;
    public  Shape(){
    }
    public Shape(double x,double y){
        this.x = x;
        this.y = y;
    }
    public  void  show(){
        System.out.println("面积为");
    }
    public abstract  double getArea();
}
