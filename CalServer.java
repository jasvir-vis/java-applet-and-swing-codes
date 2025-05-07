import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

interface Method extends Remote{
	double add(double num1,double num2) throws RemoteException;
	double sub(double num1,double num2) throws RemoteException;
	double mul(double num1,double num2) throws RemoteException;
	double div(double num1,double num2) throws RemoteException;
}

public class CalServer extends UnicastRemoteObject implements Method{
	public CalServer()throws RemoteException{
		super();
		System.out.println("Server Started");
	}
	
	public double add(double num1,double num2){
		return num1+num2;
	}
	public double sub(double num1,double num2){
		return num1-num2;
	}
	public double mul(double num1,double num2){
		return num1*num2;
	}
	public double div(double num1,double num2){
	    if(num2==0) throw new ArithmeticException("can't divide by zero");
		return num1/num2;	
	}
	
	public static void main(String args[]){
		try {
            CalServer server = new CalServer();
            Naming.rebind("rmi://localhost/CalService", server);
            System.out.println("Server is ready.");
        } catch (Exception e) { 
            System.out.println("Error: " + e);
        }
	}

}
