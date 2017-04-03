package com.ReadWriteLock;

public class Main {

	public static void main(String[] args) {
		 PriceInfo priceInfo = new PriceInfo();
		 for(int i = 0;i<10;i++){
			 new Thread(new Reader(priceInfo)).start();
			 new Thread(new Writer(priceInfo)).start();
		 }
	}

}
