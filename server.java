import java.rmi.*;

public class server {
	public static void main(String args[])throws Exception
	{
		try {
			sampleserverimpl server = new sampleserverimpl();
			Naming.rebind("rmi://localhost:4000/SERVER", server);
			System.out.println("SERVER IS WAITING");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
