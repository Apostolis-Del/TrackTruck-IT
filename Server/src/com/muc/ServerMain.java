package com.muc;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
    public static void main(String[] args) {
        int port = 8818;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while(true) {
                Socket clientSocket = serverSocket.accept();
                OutputStream outputStream=clientSocket.getOutputStream();
                outputStream.write("Hello World\n".getBytes());
                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
