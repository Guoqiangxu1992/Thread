package com.ReentrantLock;

public class Main {

	public static void main(String[] args) {
		PrintJob print = new PrintJob();
		Job job = new Job(print);
		for(int i = 0;i<10;i++){
			new Thread(job).start();
		}
	}

}
