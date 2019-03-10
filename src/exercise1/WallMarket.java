package exercise1;

/**
 * 定义一个WallMarket类，继承自Market抽象类实现shop()方法
 * @许源 2019年3月10日
 */

public class WallMarket extends  Market {
    @Override
    public void shop() {
        System.out.println(name+"实体店购买"+goods);
    }
}
