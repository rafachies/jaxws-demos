package org.chies.jaxwsdemo.server.service;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.soap.Addressing;

@WebService(targetNamespace = "org.chies.jaxwsdemo", serviceName = "RequestService")
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT, use=SOAPBinding.Use.LITERAL, parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
@Addressing(enabled = true, required = true)
public interface RequestService {

	@WebMethod
	@Oneway
	public void request(String nome, String document, String age);
	
}
