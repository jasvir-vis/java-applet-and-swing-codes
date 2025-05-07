import java.rmi.registry.*;
import java.rmi.*;
import java.rmi.server.*;

interface MethodImp extends Remote {
    double getSqrt(double db1) throws RemoteException;
}

public class rmiserver extends UnicastRemoteObject implements MethodImp {
    public rmiserver() throws RemoteException {
        super();
        System.out.println("The server is initiated...");
    }

    public double getSqrt(double db1) throws RemoteException { 
        return Math.sqrt(db1);
    }

    public static void main(String arg[]) {
        try {
            rmiserver server = new rmiserver();
            Naming.rebind("rmi://localhost/sqrt", server);
            System.out.println("Server is ready.");
        } catch (Exception e) { 
            System.out.println("Error: " + e);
        }
    }
}
