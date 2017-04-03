package com.Cinema;

public class Cinema {
	private Object controllerCinemaOne;
	private Object controllerCinemaTwo;
	private Long cansellNumberOne;
	private Long cansellNumberTwo;
	public Cinema() {
		 controllerCinemaOne = new Object();
	     controllerCinemaTwo = new Object();
	     cansellNumberOne = 20l;
	     cansellNumberTwo = 20l;
	}

	
	
	public boolean  sellerCinemaOne(int num){
		synchronized (cansellNumberOne) {
			if(cansellNumberOne>num){
				cansellNumberOne-=num;
				return true;
			}else{
				return false;
			}
		}
		
	}
	
	public boolean sellerCinemaTwo(int num){
		synchronized (cansellNumberTwo) {
		  if(cansellNumberTwo>num){
			  cansellNumberTwo-=num;
			  return true;
		  }	else{
			  return false;
		  }
		}
	}
	
	public Long returnNumberOne(){
		return cansellNumberOne;
	}
	public Long returnNumberTwo(){
		return cansellNumberTwo;
	}
	
	
	
	
	

}
