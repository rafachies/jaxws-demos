package org.chies.wsthreadsafe.client;

import java.net.URL;

public class MySingleton {

	private MyService service;
	private static MySingleton instance;
	
	private MySingleton() throws Exception {
		MyService_Service stub = new MyService_Service(new URL("http://localhost:8080/wsthreadsafe/myservice?wsdl"));
		service = stub.getMyServicePosrt();
	}
	
	public static MySingleton getInstance() throws Exception {
		if (instance == null) {
			instance = new MySingleton();
		}
		return instance;
	}
	
	public MyService getService() {
		return service;
	}
}
