package com.thread;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * ${DESCRIPTION}
 *
 * @author riverxu
 * @create 2016-04-11-3:26.
 */
public class SendThread extends Thread {

    private Socket s;

    public SendThread(Socket s) {
        this.s = s;
    }

    public void run() {
        try {
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);

            while (true) {
                Scanner sc = new Scanner(System.in);
                String str = sc.next();
                dos.writeUTF(str);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
