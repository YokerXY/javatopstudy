package com.study.exercise11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Comparable的练习
 * @author 许源 2019年3月20日
 */
public class CarList {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("大众", 222222));
        list.add(new Car("奥迪", 333333));
        list.add(new Car("奔驰", 6666666));
        list.add(new Car("兰博基尼", 8888888));
        Collections.sort(list);
        for (Car car : list) {
            System.out.println("名称:" +car.getName() + ",价格：" + car.getPrice());
        }
    }
}

