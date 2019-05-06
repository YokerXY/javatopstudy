package exercise18;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(2222);
        System.out.println("服务器已经启动");
        InputStream in;
        Socket socket = ss.accept();
        while (true){
            in = socket.getInputStream();
            byte[] b = new byte[1024];
            in.read(b);
            System.out.println("客户端"+socket.getInetAddress()+"发送的数据是："+new String(b));
            OutputStream out = socket.getOutputStream();
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入要发给服务器的内容:");
            String info  = scanner.nextLine();
            out.write(info.getBytes());
        }


    }
}