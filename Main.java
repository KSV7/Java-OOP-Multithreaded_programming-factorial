package com.gmail.kutepov89.sergey;

public class Main {

	public static void main(String[] args) {
		Thread thr[] = new Thread[100];
		for (int j = 1; j < thr.length; j++) {
			thr[j] = new Thread(new FactorialThread(j));
		}
		for (int j = 1; j < thr.length; j++) {
			thr[j].start();
		}
		for (int j = 1; j < thr.length; j++) {
			try {
				thr[j].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " is stop");
	}

}