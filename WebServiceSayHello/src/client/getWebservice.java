package client;

import java.net.URL;

import com.github.hadrychen.service.impl.CalculatePortBindingStub;
import com.github.hadrychen.service.impl.CalculateServiceLocator;

public class getWebservice {

	public static void main(String[] args) {
		CalculatePortBindingStub stub = null;
		CalculateServiceLocator local = null;
		try {
			local = new CalculateServiceLocator();
			URL url = new URL("http://localhost:8080/Service/MyWebService");
			stub = (CalculatePortBindingStub)local.getCalculatePort(url);
			
			int result = stub.getResult();
			System.out.println(result);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
