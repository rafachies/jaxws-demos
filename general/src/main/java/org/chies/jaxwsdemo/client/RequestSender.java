package org.chies.jaxwsdemo.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

import org.apache.cxf.ws.addressing.AddressingBuilder;
import org.apache.cxf.ws.addressing.AddressingProperties;
import org.apache.cxf.ws.addressing.AttributedURIType;
import org.apache.cxf.ws.addressing.EndpointReferenceType;
import org.apache.cxf.ws.addressing.JAXWSAConstants;
import org.chies.jaxwsdemo.server.service.RequestService;

public class RequestSender {

	private static final String MESSAGE_ID = "1111222233334444";
	private static final String REQUEST_URL = "http://localhost:9000/requestservice?wsdl";
	private static final String RESPONSE_URL = "http://localhost:9000/responseservice?wsdl";

	public void sendSoapRequest(String nome, String document, String age) {
		try {
			Service service = createService();
			RequestService requestService = service.getPort(RequestService.class);
			enrichServiceWithWSA(requestService);
			requestService.request(nome, document, age);
			System.out.println("[CLIENT] Request sent to server with messageId " + MESSAGE_ID  + ". As the service is asynchronous I've just received a 202 http response. The server will send the response in some seconds.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void enrichServiceWithWSA(RequestService service) {
		AddressingBuilder addressingBuilder = AddressingBuilder.getAddressingBuilder();
		AddressingProperties addressingProperties = addressingBuilder.newAddressingProperties();
		AttributedURIType messageID = new AttributedURIType();
		AttributedURIType replyTo = new AttributedURIType();
		replyTo.setValue(RESPONSE_URL);
		messageID.setValue(MESSAGE_ID);
		EndpointReferenceType replyToRef = new EndpointReferenceType();
		replyToRef.setAddress(replyTo);
		addressingProperties.setReplyTo(replyToRef);
		addressingProperties.setMessageID(messageID);
		Map<String, Object> requestContext = ((BindingProvider) service).getRequestContext();
		requestContext.put(JAXWSAConstants.CLIENT_ADDRESSING_PROPERTIES, addressingProperties);
	}
	
	private Service createService() throws MalformedURLException {
		URL url = new URL(REQUEST_URL);
		QName qname = new QName("org.chies.jaxwsdemo", "RequestService");
		Service service = Service.create(url, qname);
		return service;
	}
}
