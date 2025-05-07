import java.net.*;
import java.util.*;

public class ClientUdp{

    DatagramSocket ds;
    DatagramPacket dp;
    InetAddress addr;

    public static void main(String args[]){
	try{
		ClientUdp cu = new ClientUdp();
		cu.go();
    	}catch(Exception e){
		System.out.println(e);
	}
    }
	
    public void go() throws Exception{
	byte [] b = new byte[64];
	String str;
	try{
		ds = new DatagramSocket(1313);
		dp = new DatagramPacket(b,b.length);

		while(true){
			ds.receive(dp);
			str = new String(dp.getData());
			System.out.println("Date and time recieved: " + " "+ str);
		}
	}catch(Exception e){
		System.out.println(e);
  	}
    }



}