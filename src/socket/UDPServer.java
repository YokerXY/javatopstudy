package socket;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class UDPServer {
    public static void main(String[] args) throws IOException {
        //1创建服务器端DatagramSocket，指定端口
        DatagramSocket socket = new DatagramSocket(8888);
        //创建数据报，用于接收客户端发送的数据
        byte[] data = new byte[1024];//创建字节数组，指定接收的数据包的大小
        DatagramPacket datagramPacket = new DatagramPacket(data,data.length);
        //接收客户端发送的数据
        System.out.println("*****服务器端已启动，等待客户端发送数据");
        socket.receive(datagramPacket);
        String info = new String(data,0,datagramPacket.getLength());
        System.out.println("我是服务器，客户端说："+info);
        InetAddress address = datagramPacket.getAddress();
        int port  = datagramPacket.getPort();
        byte[] data2 = "欢迎您啊！".getBytes();
        //创建数据报，包含响应的数据信息
        DatagramPacket datagramPacket2 = new DatagramPacket(data2,data2.length,address,port);
        //响应客户端
        socket.send(datagramPacket2);
        //关闭资源
        socket.close();
    }
}
