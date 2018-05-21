package com.aps.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TimePass {

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {

		/*
		 * System.out.println(Math.min(Double.MIN_VALUE, 0.0d)); // int x = 1 /
		 * 0; System.out.println(1 / 0.0); Map<String, String> map = new
		 * HashMap<String, String>(); map.put("a", "asd"); map.put("a", "ddd");
		 * System.out.println(map); char[] chars = new char[] { '\u0097' };
		 * String str = new String(chars); byte[] bytes = str.getBytes();
		 * System.out.println(Arrays.toString(bytes)); //
		 * System.out.println(getInt()); TimePass t = null;
		 * 
		 * try { A a = new A(); // t.getInt(); } catch (Throwable e) { //
		 * e.printStackTrace(); } System.out.println("44"); }
		 * 
		 * int getInt() { return (true ? null : 0); }
		 */

		B b = new B();
		// b.setId(123);
		// b.setId2(1111);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
				"D:/a.txt"));
		out.writeObject(b);
		System.out.println("BEFORE");
		System.out.println(b.a.getId());
		/* System.out.println(b.getId2()); */
		out.close();
		ObjectInputStream oin = new ObjectInputStream(new FileInputStream(
				"D:/a.txt"));
		B b2 = (B) oin.readObject();
		System.out.println("AFTER");
		System.out.println(b.a.getId());
		// System.out.println(b2.getId2());
	}
}

class A {

	int id = 12;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

class C extends A implements Serializable {

	int id2;

	public int getId2() {
		return id2;
	}

	public void setId2(int id2) {
		this.id2 = id2;
	}

}

class B implements Serializable {
	A a = new A();
}
