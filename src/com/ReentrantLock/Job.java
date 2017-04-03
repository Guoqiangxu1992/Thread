package com.ReentrantLock;

public class Job implements Runnable{
	
	private PrintJob printJob;
	
	public Job(PrintJob printJob){
		this.printJob = printJob;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+":readly to print......");
		printJob.printDucument();
		System.out.println(Thread.currentThread().getName()+":has bean to print......");
	}

}
