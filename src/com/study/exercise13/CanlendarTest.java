package com.study.exercise13;

import java.util.Calendar;
import java.util.Date;

/**
 * Canlendar对日期和时间的处理
 * @author 许源2019年3月22日、
 */
public class CanlendarTest {
    public static void main(String[] args) {
        //创建calendar对象
        Calendar calendar =Calendar.getInstance();
        //获取时间
        int year = calendar.get(calendar.YEAR);
        int mouth = calendar.get(calendar.MONTH);
        int day = calendar.get(calendar.DAY_OF_MONTH);
        int hour= calendar.get(calendar.HOUR_OF_DAY);
        int minute =calendar.get(calendar.MINUTE);
        int second= calendar.get(calendar.SECOND);
        System.out.println("当前时间："+year+"-"+mouth+"-"+day+"-"+hour+"-"+minute+"-"+second);
        //将calendar对象转为Date对象
        Date date = calendar.getTime();
        Long time = calendar.getTimeInMillis();
        System.out.println("当前时间："+date);
        System.out.println("当前毫秒数："+time);
    }
}

