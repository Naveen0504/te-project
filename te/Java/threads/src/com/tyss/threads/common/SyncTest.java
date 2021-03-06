package com.tyss.threads.common;

public class SyncTest {

	public static void main(String[] args) {
		SyncThread syncThread = new SyncThread();
//
//		Runnable ref1 = () -> {
//			syncThread.printTable(4);
//		};
//
//		Runnable ref2 = () -> {
//
//			syncThread.printTable(100);
//
//		};
		Runnable ref1 = () -> {
			synchronized (syncThread) {

				syncThread.printTable(4);
			}
		};

		Runnable ref2 = () -> {
			synchronized (syncThread) {

				syncThread.printTable(40);
			}

		};

		Thread thread = new Thread(ref1);
		Thread thread2 = new Thread(ref2);

		thread.start();
		thread2.start();
	}
}
