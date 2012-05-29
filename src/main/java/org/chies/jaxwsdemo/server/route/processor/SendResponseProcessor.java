package org.chies.jaxwsdemo.server.route.processor;

import java.net.URL;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.ws.addressing.AddressingBuilder;
import org.apache.cxf.ws.addressing.AddressingProperties;
import org.apache.cxf.ws.addressing.JAXWSAConstants;
import org.apache.cxf.ws.addressing.RelatesToType;
import org.chies.jaxwsdemo.client.service.ResponseService;

public class SendResponseProcessor implements Processor {

	private static final String CAMEL_CXF_HEADER = "camelcxfmessage";
	private static final String RESPONSE = "This is an asynchronous response";
	private static final String WSA_HEADER = "javax.xml.ws.addressing.context.inbound";

	public void process(Exchange exchange) throws Exception {
		try {
			AddressingProperties addressingProperties = getWSAFromMessage(exchange);
			String responseUrl = getUrlFromReplyTo(addressingProperties);
			String relatesTo = getFromMessageId(addressingProperties);
			URL url = new URL(responseUrl);
			QName qname = new QName("org.chies.jaxwsdemo", "ResponseService");
			Service service = Service.create(url, qname);
			ResponseService requestService = service.getPort(ResponseService.class);
			enrichServiceWithWSA(requestService, relatesTo);
			requestService.response(RESPONSE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void enrichServiceWithWSA(ResponseService service, String messageID) {
		AddressingBuilder addressingBuilder = AddressingBuilder.getAddressingBuilder();
		AddressingProperties addressingProperties = addressingBuilder.newAddressingProperties();
		RelatesToType relatesToType = new RelatesToType();
		relatesToType.setValue(messageID);
		addressingProperties.setRelatesTo(relatesToType);
		Map<String, Object> requestContext = ((BindingProvider) service).getRequestContext();
		requestContext.put(JAXWSAConstants.CLIENT_ADDRESSING_PROPERTIES, addressingProperties);
	}

	private AddressingProperties getWSAFromMessage(Exchange exchange) {
		Map<String, Object> headers = exchange.getIn().getHeaders();
		SoapMessage soapMessage = (SoapMessage) headers.get(CAMEL_CXF_HEADER);
		AddressingProperties addressingProperties = (AddressingProperties) soapMessage.get(WSA_HEADER);
		return addressingProperties;
	}
	
	private String getFromMessageId(AddressingProperties addressingProperties) {
		return addressingProperties.getMessageID().getValue();
	}
	
	private String getUrlFromReplyTo(AddressingProperties addressingProperties) {
		return addressingProperties.getReplyTo().getAddress().getValue();
	}

}
