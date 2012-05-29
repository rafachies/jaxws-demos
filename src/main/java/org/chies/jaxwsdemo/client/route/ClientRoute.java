package org.chies.jaxwsdemo.client.route;

import org.apache.camel.builder.RouteBuilder;
import org.chies.jaxwsdemo.client.route.processor.PrintResponseProcessor;
import org.chies.jaxwsdemo.client.service.ResponseService;

public class ClientRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("cxf:/responseservice?address=http://localhost:9000/responseservice&serviceClass=" + ResponseService.class.getName())
		.process(new PrintResponseProcessor());
	}

}
