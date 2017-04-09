package com.FactorCalable;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class FactorCallable implements Callable<Integer>{
	private int number;
	
	public FactorCallable(int number){
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {
		int result = 1;
		if(number==0||number==1){
			result = 1;
		}else{
			for(int i = 2;i<=number;i++){
				TimeUnit.MILLISECONDS.sleep(1000);
				result*=number;
			}
		}
		System.out.println("thread:"+Thread.currentThread().getName()+"--->result:"+result);
		return result;
	}

}
