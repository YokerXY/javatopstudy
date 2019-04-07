package exercise16;
//继承Thread类
public class ThreadTest extends  Thread {
    private  int  count  = 10;
    //重写run()方法
    public  void  run(){
        while (true){
            System.out.print(count  +" ");
            //使count变量自减
            if (--count ==0){
                break;
            }
        }
    }

    public static void main(String[] args) {
        ThreadTest test = new ThreadTest();
        test.start();
    }
}

