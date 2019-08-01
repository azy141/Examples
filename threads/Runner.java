package com.fdmgroup.threads;

public class Runner {

	public static void main(String[] args) {
		AdesThread adesThread = new AdesThread();
		adesThread.start();
		adesThread.setName("ThreadName1");
		AdesThread adesThread1 = new AdesThread();
		adesThread1.start();
		
		
		AdesRunnable adesRunnable = new AdesRunnable();
		Thread t = new Thread(adesRunnable);
		t.start();


	}

}
