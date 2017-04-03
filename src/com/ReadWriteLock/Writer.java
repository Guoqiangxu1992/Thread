package com.ReadWriteLock;

public class Writer implements Runnable{
private PriceInfo priceInfo;
	
	public Writer(PriceInfo priceInfo){
		this.priceInfo = priceInfo;
	}

	@Override
	public void run() {
		for(int i = 0;i<100;i++){
			try {
				Thread.sleep(2000l);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":---->now readly to modify the price:");
			priceInfo.setPrice(Math.random()*100, Math.random()*100);
			System.out.println(Thread.currentThread().getName()+":---->now the price is has bean modify!!!");
		}
	}

}
