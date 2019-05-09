package socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        //定义服务器的地址，端口号，数据
        InetAddress address = InetAddress.getByName("localhost");
        int port  = 8888;
        byte[] data = "用户名：XuYiNan;密码： 1433223".getBytes();
        //创建数据报，包含发送的数据信息
        DatagramPacket datagramPacket = new DatagramPacket(data,data.length,address,port);
        DatagramSocket socket = new DatagramSocket();
        //向服务器端发送数据
        socket.send(datagramPacket);
        //创建数据报，用于服务器端响应的数据
        byte[] data2 = new byte[1024];
        DatagramPacket datagramPacket2 = new DatagramPacket(data2,data2.length);
        //接收服务器响应的数据
        socket.receive(datagramPacket2);
        //3接收数据
        String reply = new String(data2,0,datagramPacket2.getLength());
        System.out.println("我是客户端，服务器说："+reply);
        //4关闭资源
        socket.close();
    }
}
