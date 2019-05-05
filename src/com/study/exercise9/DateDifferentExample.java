package com.study.exercise9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 计算两个日期的差值
 * @author 许源
 * 2019年3月18日
 */
public class DateDifferentExample {
    public static void main(String[] args) {
        //定义起始点时间
        String oneTime = "2019-3-17 7:33:58";
        String threeTime = "2019-3-18 6:00:22";
        String fourTime = "2019-3-18 8:34:54";
        String fiveTime = "2019-3-18 7:44:56";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentTime = new Date();
        System.out.println(currentTime);
        String twoTime = format.format(currentTime);
        Date d1, d2, d3, d4, d5;
            long diff1 = 0;
            long diff2 = 0;
            long diff3 = 0;
            //通过SiampleDateFormat的对象来把String类型的时间对象转化为Date类型的对象
            try {
                d1 = format.parse(oneTime);
                d2 = format.parse(twoTime);
                d3 = format.parse(threeTime);
                d4 = format.parse(fourTime);
                d5 = format.parse(fiveTime);
                //毫秒ms的差值
                diff1 = d2.getTime() - d1.getTime();
                diff2 = d2.getTime() - d3.getTime();
                diff3 = d2.getTime() - d5.getTime();
            } catch (ParseException e) {
                e.printStackTrace();
            }
            //将毫秒分别换算为分、小时、天
            long diffMinutes = diff3 / (1000 * 60);
            long diffHours = diff2 / (1000 * 60 * 60);
            long diffDays = diff1 / (1000 * 60 * 60 * 24);
            System.out.println("现在时间：" + twoTime);
            System.out.println(oneTime + "   " + Math.abs(diffDays) + "天前");
            System.out.println(threeTime + "   " + Math.abs(diffHours) + "小时前");
            System.out.println(fiveTime + "   " + Math.abs(diffMinutes) + "分前");
            System.out.println(fourTime + "   " + " 刚刚");

    }
}
