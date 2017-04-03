package com.ProducerConsumer;

public class Main {

	public static void main(String[] args) {
		Storage storage = new Storage();
		Producer producer = new Producer(storage);
		Consumer consumer = new Consumer(storage);
		Thread thread1 = new Thread(producer);
		Thread thread2 = new Thread(consumer);
		thread2.start();
		thread1.start();
	}

}
