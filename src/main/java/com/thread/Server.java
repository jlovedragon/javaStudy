package com.thread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ${DESCRIPTION}
 *
 * @author riverxu
 * @create 2016-04-11-3:33.
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8888);

            System.out.println("监听端口号：8888");
            Socket s = ss.accept();

            // 启动发送消息线程
            new SendThread(s).start();

            // 启动接受消息线程
            new RecieveThread(s).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
