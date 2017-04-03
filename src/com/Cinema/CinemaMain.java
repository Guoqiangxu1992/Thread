package com.Cinema;

public class CinemaMain {

	public static void main(String[] args) {
		Cinema cinema = new Cinema();
		new Thread(new ControllerCinemaOne(cinema)).start();
		new Thread(new ControllerCinemaTwo(cinema)).start();
		try {
			Thread.sleep(4000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("room one = "+cinema.returnNumberOne());
		System.out.println("room two = "+cinema.returnNumberTwo());
	}

}
