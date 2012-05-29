package org.chies.jaxwsdemo.server.route;

import org.apache.camel.builder.RouteBuilder;
import org.chies.jaxwsdemo.server.route.processor.SendResponseProcessor;
import org.chies.jaxwsdemo.server.route.processor.SleeperProcessor;
import org.chies.jaxwsdemo.server.service.RequestService;

public class ServerRoute extends RouteBuilder {
	
	@Override
	public void configure() throws Exception {
		from("cxf:/requestservice?address=http://localhost:9000/requestservice&serviceClass=" + RequestService.class.getName())
		.process(new SleeperProcessor())
		.process(new SendResponseProcessor());
	}
	
}