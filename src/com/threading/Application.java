package com.threading;

public class Application {
	public static void main(String args[]) {
		
		Sequence sequence = new Sequence();
		
		System.out.println("Starting:");

		Task taskRunner = new Task(sequence);
		taskRunner.start();
		
		Task taskRunner2 = new Task(sequence);
		taskRunner2.start();
		
	}
	

}


class Task extends Thread{
	
	Sequence sequence = null;
	
	public Task(Sequence sequence) {
		this.sequence = sequence;
	}
	
	
	public void run() {
		for(int i=0; i < 1000; i++) {
		System.out.println(Thread.currentThread().getName() + " - " + "Number: " + sequence.getNext() );
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			
		}

	  }
   }
}