package com.tnsif.day13.threats;

public class RunnableDemo {

	public static void main(String[] args) {
		UsingRunnable obj=new UsingRunnable(1,6,"Vanakkam");
		
		Runnable runnable=new Runnable() {
			public void run()
			{
				System.out.println("running task from anonymous class");
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		
		runnable = new Runnable() {
			@Override
			public void run() {
				try {
					for(int i=1;i<4;i++) {
						
						System.out.println("Child Thread Task:"+i);
						Thread.sleep(1500);
					}
				}
				catch (InterruptedException e) {
					System.out.println("Error");
				}
			}
		};
		thread = new Thread(runnable);
		thread.start();
	}
}
	    


