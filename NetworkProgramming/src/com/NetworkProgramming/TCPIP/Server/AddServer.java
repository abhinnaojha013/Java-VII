package com.NetworkProgramming.TCPIP.Server;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class AddServer {
    private Socket socket = null;
    private ServerSocket serverSocket = null;
    private DataInputStream dataInputStream = null;

    public AddServer(int port) {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server started...");
            System.out.println("Waiting for client...");

            socket = serverSocket.accept();
            System.out.println("Client accepted");

            dataInputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

            String line = "";

            int sum = 0, data;
            while (!line.equals("over")) {
                try {
                    line = dataInputStream.readUTF();
                    if (!line.equals("over")) {
                        data = Integer.parseInt(line);
                        sum += data;
                    }
                }
                catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
            System.out.println("Sum is: " + sum);

            System.out.println("Closing server");
            socket.close();
            dataInputStream.close();
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void main(String[] args) {
        AddServer server = new AddServer(8888);
    }
}
