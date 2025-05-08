import java.net.*;

public class UpperServer {

    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(1234);
        byte[] receiveBuffer = new byte[1024];
        byte[] sendBuffer;

        while (true) {
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            ds.receive(receivePacket);

            String clientMsg = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Client says: " + clientMsg);

            String upper = clientMsg.toUpperCase();
            sendBuffer = upper.getBytes();

            InetAddress clientAddress = receivePacket.getAddress();
            int clientPort = receivePacket.getPort();

            DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, clientAddress, clientPort);
            ds.send(sendPacket);
        }
    }
}
