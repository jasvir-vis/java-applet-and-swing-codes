import java.net.*;
import java.util.*;

public class ServerUdp {

    DatagramSocket ds;
    DatagramPacket dp;
    InetAddress addr;

    public static void main(String[] args) throws Exception{    
            ServerUdp su = new ServerUdp();
            su.go();
    }

    public ServerUdp() throws Exception {
        addr = InetAddress.getByName("localhost");
        ds = new DatagramSocket();
    }

    public void go() throws Exception {
        byte[] buff;
        for (;;) {
                Thread.sleep(1000);
                System.out.println("Sending...");
                String str = new Date().toString();
                buff = str.getBytes();
                dp = new DatagramPacket(buff, buff.length, addr, 1313);
                ds.send(dp);       
        }
    }
}