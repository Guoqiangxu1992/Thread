package com;

public class InterruptThread implements Runnable{
	private static int i = 0;

	@SuppressWarnings("static-access")
	public static void main(String[] args){
		InterruptThread inte = new InterruptThread();
		Thread t = new Thread(inte);
		t.start();
		try {
			t.sleep(5000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.interrupt();
	}

	@Override
	public void run() {
			
			for(int i= 0;i<1000000000;i++){
				try {
					sys(i);
				} catch (InterruptedException e) {
					break;
				}
			}
	}
	
	
	public void sys(int i) throws InterruptedException{
		System.out.println(i);
		if(Thread.interrupted()){
			throw new InterruptedException();
		}
	}

}
