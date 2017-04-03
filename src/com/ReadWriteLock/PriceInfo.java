package com.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class PriceInfo {
	private Double priceOne;
	private Double priceTwo;
	
	private ReadWriteLock lock;
	
	public PriceInfo(){
		priceOne = 20.1d;
		priceTwo = 40.2d;
		lock = new ReentrantReadWriteLock();
	}
	
	public Double getPriceOne(){
		lock.readLock().lock();;
		Double value = priceOne;
		lock.readLock().unlock();
		return value;
		
	}
	
	public Double getPriceTwo(){
		lock.readLock().lock();;
		Double value = priceTwo;
		lock.readLock().unlock();
		return value;
		
	}
	
	public void setPrice(Double value1,Double value2){
		lock.writeLock().lock();
		priceOne = value1;
		priceTwo = value2;
		lock.writeLock().unlock();
	}
	

}
