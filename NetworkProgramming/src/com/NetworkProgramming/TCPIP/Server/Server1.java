package com.NetworkProgramming.TCPIP.Server;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    private Socket socket = null;
    private ServerSocket serverSocket = null;
    private DataInputStream dataInputStream = null;

    public Server1(int port) {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server started...");
            System.out.println("Waiting for client...");

            socket = serverSocket.accept();
            System.out.println("Client accepted");

            dataInputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            String line = "";

            while (!line.equals("_Over_")) {
                try {
                    line = dataInputStream.readUTF();
                    System.out.println(line);
                }
                catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }

            System.out.println("Closing connection...");
            socket.close();
            dataInputStream.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server1 server1 = new Server1(4444);
    }
}
