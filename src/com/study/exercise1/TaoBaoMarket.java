package com.study.exercise1;

/**
 * 定义一个TaoBaoMarket类继承自Market抽象类实现shop()方法
 * @许源 2019年3月10日
 */
public class TaoBaoMarket  extends Market{
    @Override
    public void shop() {
        System.out.println(name+"网购"+ goods);
    }
}
