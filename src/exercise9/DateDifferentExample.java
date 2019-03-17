package exercise9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 计算日期的差值
 * @author 许源
 * 2019年3月18日
 */
public class DateDifferentExample {
    public static void main(String[] args) {
        //分别定义起止时间
        String startTime = "2019-03-17 07:00:00 ";
        String stopTime = "2019-03-18 07:00:00";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1;
        Date d2;
        long diff = 0;
        try {
            d1 = format.parse(startTime);
            d2 = format.parse(stopTime);
            //毫秒ms的差值
            diff = d2.getTime() - d1.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //将毫秒分别换算成秒、分、小时、天
        long diffSeconds = diff / 1000;
        long diffMinutes = diff / (1000 * 60);
        long diffHours = diff / (1000 * 60 * 60);
        long diffDays = diff / (1000 * 60 * 60 * 24);
        System.out.println("两个时间相差：" + Math.abs(diffSeconds) + "秒");
        System.out.println("两个时间相差：" + Math.abs(diffMinutes) + "分");
        System.out.println("两个时间相差：" + Math.abs(diffHours) + "小时");
        System.out.println("两个时间相差：" + Math.abs(diffDays) + "天");
    }
}

