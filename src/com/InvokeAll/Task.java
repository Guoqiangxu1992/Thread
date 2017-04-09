package com.InvokeAll;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Task implements Callable<Result>{
	private String name;
	
	public Task(String name){
		this.name = name;
	}

	@Override
	public Result call() throws Exception {
		System.out.println("start--->"+name);
		Long number = (long) (Math.random()*120+10);
		TimeUnit.MILLISECONDS.sleep(number);
		System.out.println("value:--->"+number);
		
		int value = 0;
		for(int i = 0;i<10;i++){
			 value +=(int) (Math.random()*10); 
		}
		Result result = new Result();
		result.setName(name);
		result.setValue(value);
		System.out.println("thread:"+Thread.currentThread().getName()+"--->End");
		return result;
	}

}
