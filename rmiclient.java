import java.rmi.*;
import java.rmi.registry.*;

public class rmiclient {
    public static void main(String arg[]) {
        try {
            MethodImp imp = (MethodImp) Naming.lookup("rmi://127.0.0.1/sqrt"); 
            double dbl = imp.getSqrt(100);
            System.out.println("The Sqrt is " + dbl);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
