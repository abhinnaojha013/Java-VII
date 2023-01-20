package com.NetworkProgramming.UDP.Sender;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender1 {
    public static void main(String[] args) throws Exception{
        DatagramSocket datagramSocket = new DatagramSocket();
        String string = "Hello";
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");

        DatagramPacket datagramPacket = new DatagramPacket(string.getBytes(), string.length(), inetAddress, 6666);

        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
