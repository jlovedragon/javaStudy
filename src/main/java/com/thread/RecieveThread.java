package com.thread;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

/**
 * ${DESCRIPTION}
 *
 * @author riverxu
 * @create 2016-04-11-3:31.
 */
public class RecieveThread extends Thread {
    private Socket s;

    public RecieveThread(Socket s) {
        this.s = s;
    }

    public void run() {
        try {
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);

            while (true) {
                String msg = dis.readUTF();
                System.out.println(msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
