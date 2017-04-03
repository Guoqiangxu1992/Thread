package com;

public class UnsafeThread {

	public static void main(String[] args) {
		Vo vo = new Vo();
		for(int i = 0;i<10;i++){
			vo.setId(i);
			new Thread(new Unsafe(vo)).start();
		}
	}
	
	


}

class Unsafe implements Runnable{
	private Vo vo;
	public Unsafe(Vo vo){
		this.vo = vo;
	}

	@Override
	public void run() {
		System.out.println(vo.getId());
	}
	
}
