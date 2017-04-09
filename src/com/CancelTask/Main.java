package com.CancelTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		Task task = new Task();
		Future<Integer> f =  executor.submit(task);
		try {
			TimeUnit.MILLISECONDS.sleep(5000l);
			System.out.println("start cancle----");
			f.cancel(true);
			System.out.println("cancle?"+f.isCancelled());
			System.out.println("isdone?"+f.isDone());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
