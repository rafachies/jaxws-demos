package org.chies.jaxwsdemo.client.service;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.soap.Addressing;

@WebService(targetNamespace = "org.chies.jaxwsdemo", serviceName = "ResponseService")
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT, use=SOAPBinding.Use.LITERAL, parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
@Addressing(enabled = true, required = true)
public interface ResponseService {

	@Oneway
	@WebMethod
	public void response(String response);
}
