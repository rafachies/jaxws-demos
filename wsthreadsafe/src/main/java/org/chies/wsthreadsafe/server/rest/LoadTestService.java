package org.chies.wsthreadsafe.server.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.chies.wsthreadsafe.client.MyService;
import org.chies.wsthreadsafe.client.MySingleton;

/**
 * JAX-RS Example
 * 
 * This class produces a RESTful service to read the contents of the members table.
 */
@Path("/loadtest")
public class LoadTestService {
   
   @GET
   public void go() throws Exception {
      MyService service = MySingleton.getInstance().getService();
      service.getCar();
      service.getCompany();
      service.getHouse();
   }
}
