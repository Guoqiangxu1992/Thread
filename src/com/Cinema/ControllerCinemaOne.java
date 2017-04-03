package com.Cinema;

public class ControllerCinemaOne implements Runnable{
	private Cinema cinema;
	
	public  ControllerCinemaOne(Cinema cinema) {
		this.cinema = cinema;
	}

	@Override
	public void run() {
		cinema.sellerCinemaOne(2);
		cinema.sellerCinemaOne(3);
		cinema.sellerCinemaOne(5);
		cinema.sellerCinemaOne(4);
		cinema.sellerCinemaOne(1);
		
	}

}
