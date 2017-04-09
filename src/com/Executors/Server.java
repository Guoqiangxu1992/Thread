package com.Executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Server {
	private ThreadPoolExecutor executor;
	
	public Server(){
		executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
	}
	
	
	public void ExecutorTask(Task task){
		System.out.println("now create a Task--->"+Thread.currentThread().getName());
		executor.execute(task);
		System.out.println("now poolSize is ："+executor.getPoolSize());
		System.out.println("now activeCount is ："+executor.getActiveCount());
		System.out.println("now completeCount is :"+executor.getCompletedTaskCount());
		try {
			Thread.sleep((long) (Math.random()*5000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void shotDown(){
		executor.shutdown();
	}

}
