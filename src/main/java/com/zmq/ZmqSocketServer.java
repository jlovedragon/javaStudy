package com.zmq;

import org.zeromq.ZMQ;

import java.util.Date;

/**
 * ZMQ Socket 服务端
 *
 * @author riverxu
 * @create 2016-10-09-16:27.
 */
public class ZmqSocketServer {

    public static void main(String[] args) {
        ZMQ.Context context = ZMQ.context(1);

        ZMQ.Socket socket = context.socket(ZMQ.PUB);  // ZMQ.PUB指定通讯模式为【发布订阅模式】的发布者
        socket.bind("tcp://192.168.1.100:9005");

        while (true) {
            String time = new Date().getTime() + "";

            byte[] reply = time.getBytes();

            socket.send(reply, 0);
            System.out.println("@@@ Server Send:" + time);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
