package org.chies.wsthreadsafe.server.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.chies.wsthreadsafe.server.model.Car;
import org.chies.wsthreadsafe.server.model.Company;
import org.chies.wsthreadsafe.server.model.House;

@WebService(name="MyService", serviceName="MyService", portName="MyServicePosrt", targetNamespace="rchies.org")
public class MyService {

	
	@WebMethod
	public House getHouse() {
		House house = new House();
		return house;
	}
	
	@WebMethod
	public Car getCar() {
		return new Car();
	}
	
	@WebMethod
	public Company getCompany() {
		return new Company();
	}
}
