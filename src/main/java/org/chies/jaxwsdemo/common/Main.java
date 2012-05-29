package org.chies.jaxwsdemo.common;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.chies.jaxwsdemo.client.RequestSender;
import org.chies.jaxwsdemo.client.route.ClientRoute;
import org.chies.jaxwsdemo.server.route.ServerRoute;

public class Main {

	private static final String AGE = "26";
	private static final String NOME = "Rafael Chies";
	private static final String DOCUMENT = "999999999";

	public static void main(String[] args) throws Exception {
		startCamel();
		sendRequest();
	}

	private static void sendRequest() {
		RequestSender requestSender = new RequestSender();
		requestSender.sendSoapRequest(NOME, DOCUMENT, AGE);
	}

	private static void startCamel() throws Exception {
		CamelContext camelContext = new DefaultCamelContext();
		camelContext.addRoutes(new ClientRoute());
		camelContext.addRoutes(new ServerRoute());
		camelContext.start();
	}
}
