package exercise19;

public class FactoryTest {
    public static void main(String[] args) {
        Shape circle =ShapeFactory.getCircleInsytanc();
        circle.draw();
        Shape  rectangle =ShapeFactory.getRetangleInstance();
        rectangle.draw();
    }
}
