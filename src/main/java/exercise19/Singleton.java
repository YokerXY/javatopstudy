package exercise19;

/**
 * 单例模式  练习
 * @author 许源
 * 2019.5.20
 */

public class Singleton {
    private static Singleton  instance = new Singleton();
    private Singleton(){
    }
    //静态方法获取唯一的可用对象
    public static Singleton getInstance(){
        return instance;
    }
    //成员方法，显示消息
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
