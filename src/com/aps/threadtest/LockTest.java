package com.aps.threadtest;

public class LockTest {
static 	Object MUTEX = new Object();

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

	public void m1() {

		synchronized (MUTEX) {
			for (int i = 0; i <= 5; i++) {
				System.out.println("M1 i= " + i + Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public void m2() {
		synchronized (MUTEX) {
			for (int i = 0; i <= 5; i++) {
				System.out.println("M2 ---i== " + i + Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
