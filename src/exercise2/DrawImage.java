package exercise2;

public interface DrawImage {          //定义一个画图像接口
     public void draw();              //定义抽象类方法“画”
}
 class Retangle implements  DrawImage{ //矩形类实现了drawTest接口
    public void draw(){
        System.out.println("画矩形");
    }
 }
class Square implements  DrawImage{
    public void draw(){
        System.out.println("画正方形");
    }
}
class Diamond implements  DrawImage{
    public void draw() {
        System.out.println("画菱形");
        }
    }

