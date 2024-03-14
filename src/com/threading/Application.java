package com.threading;

public class Application {
	public static void main(String args[]) {
		
		Task taskRunner = new Task();
		taskRunner.start();
		System.out.println("Hi");

	}
	

}


class Task extends Thread {
	public void run() {
		for(int i=0; i < 1000; i++) {
		System.out.println("Number: " + i);
		}
	}
}