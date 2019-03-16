package exercise8;

/**
 * String，StringBuffer,StringBuilder的比较
 * @author 许源 2019年3月16日
 */
public class StringTest {
   //定义次数
    private static  int time = 50000;
    public static void main(String[] args) {
        testString();
        testStringBuffer();
        testStringBuilder();
    }
    public static void testString(){
        String s = "";
        //获取一毫秒为单位当前开始时间
        long begin = System.currentTimeMillis();
        //调用 5000 次的拼接操作，每次都会生成新的 String 对象！
        for (int i = 0; i < time ; i++){
            s += "java";
        }
        long over = System.currentTimeMillis();
        //求出实际耗时
        System.out.println("操作 String 类型使用的时间为：" + (over - begin)+ "毫秒");
    }
    public static void testStringBuffer(){
        StringBuffer stringBuffer = new StringBuffer();
        long begin = System.currentTimeMillis();
        for (int i = 0; i < time ; i++){
            stringBuffer.append("java");
        }
        //获取以毫秒为单位的当前结束时间
        long over = System.currentTimeMillis();
        //求出实际耗时
        System.out.println("操作 StringBuffer 类型使用的时间为：" + (over - begin)+"毫秒");
    }
    public static void testStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        long begin = System.currentTimeMillis();
        for (int i = 0; i < time; i++) {
            stringBuilder.append("java");
        }
        //获取以毫秒为单位的当前结束时间
        long over = System.currentTimeMillis();
        System.out.println("操作 StringBuilder 类型使用的时间为：" + (over -
                begin) + "毫秒");
    }
}


