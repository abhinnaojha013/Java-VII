package com.NetworkProgramming.UDP.Reciever;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver1 {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(6666);
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, 1024);
        datagramSocket.receive(datagramPacket);
        String string = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
        System.out.println(string);
        datagramSocket.close();
    }
}
