package com.NetworkProgramming.TCPIP.Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {

    private Socket socket = null;
    private DataInputStream dataInputStream = null;
    private DataOutputStream dataOutputStream = null;


    public Client1(String ipAddress, int port) {
        try {
            socket = new Socket(ipAddress, port);
            System.out.println("Connected to server " + ipAddress + ": " + port);

            dataInputStream = new DataInputStream(System.in);
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
        }
        catch (UnknownHostException unknownHostException) {
            unknownHostException.printStackTrace();
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }

        String line = "";

        while (!line.equals("_Over_")) {
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
        Client1 client1 = new Client1("127.0.0.1", 4444);
    }
}
