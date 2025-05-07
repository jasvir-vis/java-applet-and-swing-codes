import java.net.*;
import java.io.*;
import java.util.*;

public class TcpServer {
    DataOutputStream dp;
    ServerSocket ss;
    Socket s;
    
    public static void main(String args[]) {
        TcpServer st = new TcpServer();
        st.connect();
    }
    
    public void connect() {
        try {
            ss = new ServerSocket(1313);
             
            while (true) {
                System.out.println("waiting for connection...");
                s = ss.accept();
                dp = new DataOutputStream(s.getOutputStream());
                dp.writeBytes("Java data server " + (new Date().toString()) + "\n");
                
                dp.close();
                s.close();
            }
        } catch (IOException ie) {
            System.out.println(ie);
        }
    }
}