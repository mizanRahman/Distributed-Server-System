import java.rmi.*;
import java.rmi.server.*;

public class sampleserverimpl extends UnicastRemoteObject implements sampleserver{
	sampleserverimpl() throws RemoteException {
		super();
		}
		public int add(int a,int b) throws RemoteException {
		return(a+b);
		}
		public int sub(int a,int b) throws RemoteException {
		return(a-b);
		}
		public int mul(int a,int b) throws RemoteException {
		return(a*b);
		}
		public int div(int a,int b) throws RemoteException {
		return(a/b);
		} 

}
