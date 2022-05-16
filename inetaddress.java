package expt6;
import java.net.*;

public class inetaddress {

	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("www.amazon.com");
			System.out.println("Hostname = "+ip.getHostName()) ;
			System.out.println("HostAddress= "+ip.getHostAddress());
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
