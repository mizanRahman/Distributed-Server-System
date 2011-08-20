import java.rmi.*;
import java.io.*;

public class client {
	public static String s;
	public static void main(String args[])throws Exception
	{
	sampleserver remoteobject  =(sampleserver)Naming.lookup("rmi://localhost:4000/SERVER");
	InputStreamReader is = new InputStreamReader(System.in);
	BufferedReader    br = new BufferedReader(is);
	System.out.println("ENTER THE FIRST NUMBER:");
	int a = Integer.parseInt(br.readLine());
	System.out.println("ENTER THE SECOND NUMBER:");
	int b = Integer.parseInt(br.readLine());
	do{
	System.out.println("*****ENTER YOUR CHOICE*****");
	System.out.println("1.ADDITION");
	System.out.println("2.SUBTRACTION");
	System.out.println("3.MULTIPLICATION");
	System.out.println("4.DIVISION");
	int c = Integer.parseInt(br.readLine());
	switch(c){
	case 1   :int ans1 = remoteobject.add(a,b);
	          System.out.println("THE REQUIRED ANSWER IS:"+ans1);
	          break;
	case 2   :int ans2 = remoteobject.sub(a,b);
	          System.out.println("THE REQUIRED ANSWER IS:"+ans2);
	          break;
	case 3   :int ans3 = remoteobject.mul(a,b);
	          System.out.println("THE REQUIRED ANSWER IS:"+ans3);
	          break;
	case 4   :int ans4 = remoteobject.div(a,b);
	          System.out.println("THE REQUIRED ANSWER IS:"+ans4);
	          break;
	}
	System.out.println("DO YOU WANT TO CONTINUE?Y/N");
	s = br.readLine();
	}
	while(s.equals("y")||s.equals("Y"));
	}

}
