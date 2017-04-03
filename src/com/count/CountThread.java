package com.count;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountThread implements Runnable{
	ExecutorService excutor =  Executors.newFixedThreadPool(5);
	static int num=0;
	static int total = 0;
	private static volatile boolean Runing = true;

	public static void main(String[] args) {
		for(int i = 0;i<5;i++){
			new Thread(new CountThread()).start();
		}
		System.out.println("total:"+total);
	}

	@Override
	public void run() {
		while(true){
			if(Runing){

				Runing = false;
				total= AddCount.add(++num,total);
				if(num>9){
					Runing = false;
					
					System.out.println("total:"+total);System.exit(0);
				}else{
					Runing = true;
				}
				

			}
		}
		}
}
