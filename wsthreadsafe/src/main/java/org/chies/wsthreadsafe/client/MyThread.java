package org.chies.wsthreadsafe.client;

public class MyThread implements Runnable{

	private MyService service;

	public MyThread(MyService service) {
		this.service = service;
	}

	@Override
	public void run() {
		try {
			service.getCar();
			System.out.println("got a car");
			Thread.sleep(300);
			service.getCompany();
			System.out.println("got a company");
			Thread.sleep(300);
			service.getHouse();
			System.out.println("got a house");
			Thread.sleep(300);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
