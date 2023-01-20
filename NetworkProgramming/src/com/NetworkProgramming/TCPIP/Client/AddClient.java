package com.NetworkProgramming.TCPIP.Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class AddClient {
    private Socket socket;
    private DataInputStream dataInputStream;
    private DataOutputStream dataOutputStream;

    public AddClient(String ipAddress, int port) {
        try {
            socket = new Socket(ipAddress, port);
            System.out.println("Connected to server " + ipAddress + ": " + port);

            dataInputStream = new DataInputStream(System.in);
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        String line = "";

        while (!line.equals("over")) {
            try {
                line = dataInputStream.readLine();
                dataOutputStream.writeUTF(line);
            }
            catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

        try {
            dataInputStream.close();
            dataOutputStream.close();
            socket.close();
            System.out.println("Connection closed");
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void main(String[] args) {
        AddClient client = new AddClient("127.0.0.1", 8888);
    }
}
