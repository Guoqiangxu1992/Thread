package com.ProducerConsumer;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Storage {
	private int maxSize;
	private List<Date> linklist;
	public Storage() {
		this.maxSize = 50;
		this.linklist = new LinkedList<Date>();
	}

	
	
	public synchronized void set(){
		while(linklist.size()==maxSize){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		linklist.add(new Date());
		System.out.println("now size is = "+linklist.size());
		notifyAll();
	}
	
	
	public synchronized void get(){
		while(linklist.size()==0){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("现在取得队列的值:"+((LinkedList<Date>) linklist).poll());
		notifyAll();
	}
	

}
