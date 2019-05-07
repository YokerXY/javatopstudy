package exercise18;


import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.io.*;
public class Client2 {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost",10000);
        System.out.println("成功连接上服务器");
        Scanner scanner = new Scanner(System.in);
        BufferedWriter buf;
        System.out.println("请输入一行信息： ");
        String str = scanner.nextLine();
        buf = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        buf.write(str);
        buf.flush();
        buf.close();
    }

}
