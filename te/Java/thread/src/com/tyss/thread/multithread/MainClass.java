package com.tyss.thread.multithread;

public class MainClass {

	public  void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i*n);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
