package com.FactorCalable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

	public static void main(String[] args) {
		ThreadPoolExecutor excutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		List<Future<Integer>> resultList = new ArrayList<>();
		Random ram = new Random();
		for(int i = 0;i<12;i++){
			FactorCallable f = new FactorCallable(ram.nextInt(10));
			Future<Integer> result = excutor.submit(f);
			//excutor.invokeAny(tasks);
			resultList.add(result);
		}
		do{
			System.out.println("main completed:"+excutor.getCompletedTaskCount());
			for(int i = 0;i<resultList.size();i++){
				Future<Integer> f1 = resultList.get(i);
				System.out.println("who is done:"+f1.isDone());
			}
		}while(excutor.getCompletedTaskCount()<resultList.size());
		
	}

}
