package com.InvokeAll;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		List<Task> list = new ArrayList<>();
		List<Future<Result>> result = new ArrayList<>();
		for(int i = 0;i<10;i++){
			Task task = new Task("task"+i);
			list.add(task);
		}
		try {
			result = executor.invokeAll(list);
			executor.invokeAll(tasks, timeout, unit)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("the result start print-------");
		for(int i= 0;i<result.size();i++){
			Future<Result> f = result.get(i);
			try {
				Result r = f.get();
				System.out.println("name:"+r.getName()+"---value"+r.getValue());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
			
		}
	}

}
