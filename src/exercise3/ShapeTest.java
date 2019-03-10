package exercise3;

/**
 * @许源 2019年3月10日
 * 实现计算矩形与圆形的面积
 */
public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Circle(3.0,3.14);
        shape.show();
        System.out.println(shape.getArea());
        Shape shape1 = new Rectangle(4.0,4.0);
        shape1.show();
        System.out.println(shape1.getArea());

    }
}
