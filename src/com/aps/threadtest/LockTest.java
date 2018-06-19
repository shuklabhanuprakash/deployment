package com.aps.threadtest;

import org.omg.CORBA.PUBLIC_MEMBER;

public class LockTest {

	public static void main(String[] args) {
		LockTest obj = new LockTest();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				obj.m1();
			}

		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				obj.m2();
			}

		});
		t1.start();
		t2.start();
	}

	public synchronized void m1() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("M1 i= "+i + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		m2();
	}

	public static synchronized void m2() {

		for (int i = 0; i <= 5; i++) {
			System.out.println("M2 ---i== "+i + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//m3();
	}

	public void m3() {
		System.out.println("M3");
	}

}
