package com.fdmgroup.threads;

public class AdesThread extends Thread {

	public void run(){
		for (int counter=0; counter<1000000;counter++){
			String name =Thread.currentThread().getName();
			System.out.println(name +", "+ counter);
		}
		
		
		
		
	}
	
	
}
