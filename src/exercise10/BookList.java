package exercise10;
import java.util.ArrayList;
import java.util.List;

/**
 * list学习及三种遍历方法
 * @author 许源 2019年3月19日
 */
public class BookList {
    public static void main(String[] args) {
        List<Book> booklist =new ArrayList<>();
        booklist.add(new Book(1,"红楼梦",11.11));
        booklist.add(new Book(2,"背影",22.99));
        booklist.add(new Book(6,"红楼梦",55.33));
        System.out.println(" ID      书名    价格");
        System.out.println("----原数据--------");
        booklist.forEach(book -> System.out.println(book.getId()+"  "+book.getName()+"  "+book.getPrice()));
        System.out.println("--------增加--------");
        booklist.add(2,new Book(3,"c++",25.88));
        booklist.forEach(book -> System.out.println(book.getId()+"  "+book.getName()+"  "+book.getPrice()));
        System.out.println("-------移除-----------");
        booklist.remove(2);
        booklist.forEach(book -> System.out.println(book.getId()+"  "+book.getName()+"  "+book.getPrice()));
        System.out.println("-------修改————");
        booklist.set(2,new Book(4,"高等数学",33.99));
        booklist.forEach(book -> System.out.println(book.getId()+"  "+book.getName()+"  "+book.getPrice()));
        System.out.println("-------------增加--------");
        System.out.println(booklist.get(1));
        booklist.add(new Book(2,"西游记",88.00));
        System.out.println(booklist);
        System.out.println(booklist.indexOf("背影"));
        System.out.println(booklist.lastIndexOf("背影"));



    }

}
