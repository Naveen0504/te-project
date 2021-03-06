package com.tyss.thread.multithread;

public class ThreadTest {

	public static void main(String[] args) {

		MainClass tables = new MainClass();

		Runnable ref1 = () -> {
			tables.printTable(10);
		};

		Runnable ref2 = () -> {
			tables.printTable(20);
		};

		Thread threadOne = new Thread(ref1);
		Thread threadTwo = new Thread(ref2);

		threadOne.start();
		threadTwo.start();
	}
}
