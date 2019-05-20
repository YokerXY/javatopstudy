package exercise19;

public class ShapeFactory {
    public  static  Shape getCircleInsytanc(){
        return new Circle();

    }
    public  static  Shape getRetangleInstance(){
        return  new Rectangle();
    }
}
