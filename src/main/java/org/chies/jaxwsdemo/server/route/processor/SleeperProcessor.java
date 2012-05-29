package org.chies.jaxwsdemo.server.route.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class SleeperProcessor implements Processor{

	public void process(Exchange exchange) throws Exception {
		System.out.println("[SERVER] sleeping for 10 seconds to show the asynchronism");
		Thread.sleep(10000);
		System.out.println("[SERVER] waking up to handle the request.");
	}

}
