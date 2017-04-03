package com.count;


public class AddCount {
	
	public static synchronized int  add(int num, int total){
		total+=num;
		System.out.println("thread:"+Thread.currentThread().getName()+"num:"+num+"+");
		return total;
	}

}
