import java.net.*;
import java.util.Scanner;

public class UpperClient {

    DatagramSocket ds;
    DatagramPacket sendPacket, receivePacket;
    InetAddress addr;
    String response;

    public static void main(String args[]) {
        try {
            UpperClient cu = new UpperClient();
            cu.go();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void go() throws Exception {
        byte[] sendBuffer;
        byte[] receiveBuffer = new byte[1024];
        Scanner sc = new Scanner(System.in);

        try {
            ds = new DatagramSocket();
            addr = InetAddress.getByName("localhost");

            while (true) {
                System.out.print("Enter a message: ");
                if (!sc.hasNextLine()) {
                    break;
                }
                String message = sc.nextLine();

                sendBuffer = message.getBytes();
                sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, addr, 1234);
                ds.send(sendPacket);

                receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                ds.receive(receivePacket);

                response = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Response from server: " + response);
            }
        } finally {
            sc.close();
            if (ds != null && !ds.isClosed()) {
                ds.close();
            }
        }
    }
}
