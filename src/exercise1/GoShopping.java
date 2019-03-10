package exercise1;

/**
 * 定义一个GoShopping类在该类中分别使用WallMarket类和TaoBaoMarket类
 * @许源 2019年3月10日
 */
public class GoShopping {
    public static void main(String[] args) {
        Market market = new WallMarket();//使用派生类对象创建抽象类对象
        market.name="沃尔玛";
        market.goods = "七匹狼西服";
        market.shop();
        market = new TaoBaoMarket();   //使用派生类创建抽象对象
        market.name ="淘宝";
        market.goods="韩都衣舍花裙";
        market.shop();

    }
}
