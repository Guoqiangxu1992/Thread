package com.Executors;

import java.util.Date;

public class Task implements Runnable{
	private Date initDate;
	private String name;
	
	public Task(String name){
		initDate = new Date();
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+":name:"+name+"-->Date:"+initDate);
        System.out.println(Thread.currentThread().getName()+":name:"+name+"-->Date:"+new Date());
	}

}
