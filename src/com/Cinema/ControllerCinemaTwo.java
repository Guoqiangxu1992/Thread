package com.Cinema;

public class ControllerCinemaTwo implements Runnable{
	private Cinema cinema;

	public ControllerCinemaTwo(Cinema cinema) {
		this.cinema = cinema;
	}

	@Override
	public void run() {
		cinema.sellerCinemaTwo(3);
		cinema.sellerCinemaTwo(3);
		cinema.sellerCinemaTwo(4);
		cinema.sellerCinemaTwo(3);
		cinema.sellerCinemaTwo(5);
		
	}

}
