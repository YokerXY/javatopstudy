package exercise20;


public class AdapterTest {
    public static void main(String[] args) {
        System.out.println("练习生招募中....");
        Student student = new Student(){
            public void javaStudy(){
                System.out.println("我是一名Rap大神");
            }
        };
        student.javaStudy();
        Student student1= new Student(){
            public void playBasketball(){
                System.out.print("我篮球打的好, ");
            }
            public void playFootball(){
                System.out.print("我还喜欢街舞");
            }
        };
        student1.playBasketball();
        student1.playFootball();
    }
}
