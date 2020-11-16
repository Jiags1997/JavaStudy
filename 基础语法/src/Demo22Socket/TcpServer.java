package Demo22Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    TCP通信的服务器端:接收客户端的请求,读取客户端发送的数据,给客户端回写数据
    表示服务器的类:
        java.net.ServerSocket:此类实现服务器套接字。

    构造方法:
        ServerSocket(int port) 创建绑定到特定端口的服务器套接字。

    服务器端必须明确一件事情,必须的知道是哪个客户端请求的服务器
    所以可以使用accept方法获取到请求的客户端对象Socket
    成员方法:
        Socket accept() 侦听并接受到此套接字的连接。

    服务器的实现步骤:
        1.创建服务器ServerSocket对象和系统要指定的端口号
        2.使用ServerSocket对象中的方法accept,获取到请求的客户端对象Socket
        3.使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
        4.使用网络字节输入流InputStream对象中的方法read,读取客户端发送的数据
        5.使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream对象
        6.使用网络字节输出流OutputStream对象中的方法write,给客户端回写数据
        7.释放资源(Socket,ServerSocket)
 */
public interface TcpServer {
    public static void main(String[] args) throws IOException {
        File file=new File("tcpserver.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        ServerSocket serverSocket=new ServerSocket(8888);
        FileOutputStream fos=new FileOutputStream(file);
        Socket socket=serverSocket.accept();
        InputStream is=socket.getInputStream();
        byte [] b=new byte[1024];
        int len=0;
        while((len=is.read(b))!=-1){
            fos.write(b,0,len);
        }
        OutputStream os=socket.getOutputStream();
        os.write("文件上传成功！".getBytes());
        fos.close();
        socket.close();
        serverSocket.close();

    }
}
