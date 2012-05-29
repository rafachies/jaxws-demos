package org.chies.jaxwsdemo.client.route.processor;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.ws.addressing.AddressingProperties;

public class PrintResponseProcessor implements Processor {

	private static final String CAMEL_CXF_HEADER = "camelcxfmessage";
	private static final String WSA_HEADER = "javax.xml.ws.addressing.context.inbound";
	
	public void process(Exchange exchange) throws Exception {
		Map<String, Object> headers = exchange.getIn().getHeaders();
		SoapMessage soapMessage = (SoapMessage) headers.get(CAMEL_CXF_HEADER);
		AddressingProperties addressingProperties = (AddressingProperties) soapMessage.get(WSA_HEADER);
		String relatesTo = addressingProperties.getRelatesTo().getValue();
		System.out.println("[CLIENT] Received response: " + exchange.getIn().getBody() + " related to " + relatesTo);
	}

}
