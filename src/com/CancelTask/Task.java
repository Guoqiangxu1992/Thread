package com.CancelTask;

import java.util.concurrent.Callable;

public class Task implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		while(true){
			System.out.println("call()----->");
			Thread.sleep(2000l);
		}
	}

}
