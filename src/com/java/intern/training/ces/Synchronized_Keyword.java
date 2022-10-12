package com.java.intern.training.ces;

//make an method synchronized --> method-2(For my understanding)
//create an synchronized method---->method-3
//use this keyword ---->method-4
//creating an ReentrantLock Class----->method-5
import java.util.concurrent.locks.ReentrantLock;

class Counting {
	int count;
	private static ReentrantLock lock = new ReentrantLock();

	public void increment() {
		lock.lock();// 1st method(For my understanding)
		count++;
		lock.unlock();
	}
}

public class Synchronized_Keyword {

	public static void main(String[] args) throws Exception {

		Counting c = new Counting();
		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					c.increment();
				}
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					c.increment();
				}
			}
		});
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		System.out.println("Counter counts " + c.count + " of times");
	}

}
