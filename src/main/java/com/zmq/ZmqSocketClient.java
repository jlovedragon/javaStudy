package com.zmq;

import org.zeromq.ZMQ;

/**
 * ZMQ socket 客户端
 *
 * @author riverxu
 * @create 2016-10-09-16:33.
 */
public class ZmqSocketClient {

    public static void main(String[] args) {
        ZMQ.Context context = ZMQ.context(1);
        ZMQ.Socket socket = context.socket(ZMQ.SUB);

        byte[] filter = "".getBytes();
        socket.subscribe(filter); // 必须设置filter，否则接收不到任何数据

        socket.connect("tcp://192.168.1.100:9005");

        while (true) {
            byte[] msg = null;
            try {
                msg = socket.recv(0);
                String time = new String(msg);
                System.out.println("#### Client Receive:" + time);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
