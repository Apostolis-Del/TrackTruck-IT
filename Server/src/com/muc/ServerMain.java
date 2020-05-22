package com.muc;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerMain {
    public static void main(String[] args) {
        int port = 8818;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while(true) {
                System.out.println("ABOUT TO ACCEPT CLIENT CONNECTION");
                Socket clientSocket = serverSocket.accept();
                System.out.println("ACCEPTED CONNECTION FROM "+clientSocket);
                ServerWorker worker=new ServerWorker(clientSocket);
                worker.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
