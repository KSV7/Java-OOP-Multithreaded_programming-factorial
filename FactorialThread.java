package com.gmail.kutepov89.sergey;

import java.math.BigInteger;

public class FactorialThread implements Runnable {
	private int number;

	public FactorialThread(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	private BigInteger calculateFactorial(int number) {
		BigInteger fact = new BigInteger("1");
		for (int i = 2; i < number; i += 1) {
			fact = fact.multiply(new BigInteger("" + i));
		}
		return fact;
	}

	@Override
	public void run() {
		Thread th = Thread.currentThread();
		for (int i = 1; i <= this.number; i++) {
			System.out.println(th.getName() + " " + i + "!= " + calculateFactorial(i));
		}
		
	}

	@Override
	public String toString() {
		return "FactorialThread [number=" + number + "]";
	}

}