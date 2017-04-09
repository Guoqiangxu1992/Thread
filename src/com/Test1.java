package com;

public class Test1 implements Runnable{
	private int number;

	public static void main(String[] args) {
		Test1 test = new Test1();
		for(int i = 0;i<1000;i++){
			new Thread(new Test1()).start();
		}
	}

	@Override
	public void run() {
		number = 5;
		System.out.println("now is :"+number);
		number = 10;
		System.out.println("now is :"+number*2);
	}

}
