package com.ReadWriteLock;

public class Reader implements Runnable{
	private PriceInfo priceInfo;
	
	public Reader(PriceInfo priceInfo){
		this.priceInfo = priceInfo;
	}

	@Override
	public void run() {
		for(int i = 0;i<100;i++){
			try {
				Thread.sleep(1000l);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":now the priceOne is :"+priceInfo.getPriceOne());
			System.out.println(Thread.currentThread().getName()+":now the priceTwo is :"+priceInfo.getPriceTwo());
		}
		
	}

}
