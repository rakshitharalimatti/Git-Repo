package lab_207;

import java.net.*;
import java.io.*;

public class Week6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			//URL yahoo = new URL("http://www.yahoo.com:80/");
			URL yahoo = new URL("http","www.yahoo.com",80,"index.html");     
			
			/* Printing the protocol, port, host of the URL */
			System.out.println("IP Address = "+ add);
			System.out.println("Local IP = " + InetAddress.getLocalHost());
			
			System.out.println("Protocol = " + yahoo.getProtocol());  //Prints Protocol
			System.out.println("Host = " + yahoo.getHost());          //Prints Host
			System.out.println("Port = " + yahoo.getPort());		  //Prints Port
			System.out.println("Filename = " + yahoo.getFile());	  //Prints Filename
			System.out.println("Reference = " + yahoo.getRef());	  //Prints Reference
			System.out.println("");
			System.out.println("Connecting to the site...\n");
			System.out.println("******  Printing the Contents of " + yahoo + " ******\n");
			
			/* Reading the incoming data from the server into buffer using BufferedReader and the InputStreamReader */
			BufferedReader bufer = new BufferedReader(new InputStreamReader(yh.openStream()));
			String input;

			while ((input = bufer.readLine()) != null)       //Check for the EOF reached.
			{
				System.out.println(input);              	 //Print the contents of the site to the screen.
			}
			bufer.close();
		}
		
		catch (MalformedURLException e)
		{
			System.out.println("MalformedURLException: " + e);
		}
		
		catch (IOException e)
		{
			System.out.println("IOException: " + e);
		}
		
	
	}

}
