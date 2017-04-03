package com.ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintJob {
	private final Lock queueLock = new ReentrantLock(false);
	
	public void printDucument(){
		queueLock.lock();
		Long time = (long) (Math.random()*10000);
		System.out.println(Thread.currentThread().getName()+"--->开始执行打印的printJob111:"+time);
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			queueLock.unlock();
		}
		

		queueLock.lock();
		Long time2 = (long) (Math.random()*10000);
		System.out.println(Thread.currentThread().getName()+"--->开始执行打印的printJob222:"+time);
		try {
			Thread.sleep(time2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			queueLock.unlock();
		}
	
	}

}
