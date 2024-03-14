package com.threading;

public class Application {
	public static void main(String args[]) {
		
		System.out.println("Starting:");

		Task taskRunner = new Task("Thread-A");
		taskRunner.run();
		System.out.println("Thread 1");
		
		Task taskRunner2 = new Task("Thread-B");
		taskRunner2.run();
		System.out.println("Thread 2");
		
	}
	

}


class Task implements Runnable {
	
	String name;
	
	public Task(String name) {
		this.name = name;
	}
	
	public void run() {
		Thread.currentThread().setName(this.name);
		for(int i=0; i < 1000; i++) {
		System.out.println("Number: " + i + " - " + Thread.currentThread().getName() );
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			
		}

	  }
   }
}