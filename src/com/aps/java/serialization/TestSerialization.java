package com.aps.java.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	/**
	 * @param args
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {

		/*
		 * Strudent stu = new Strudent(); stu.setId(31);
		 * stu.setName("MAHATWAhhhhh"); stu.setAge(33);
		 * stu.setAddress("MUMBAIhhhhh");
		 * 
		 * serialize(stu);
		 */
		deserialize();

	}

	/**
	 * @param stu
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	private static void serialize(Strudent stu) throws IOException,
			FileNotFoundException {
		ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(
				"D://BHAnu//test//abcd.txt"));
		obj.writeObject(stu);
	}

	/**
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws ClassNotFoundException
	 */
	private static void deserialize() throws IOException,
			FileNotFoundException, ClassNotFoundException {
		ObjectInputStream obj = new ObjectInputStream(new FileInputStream(
				"D://BHAnu//test//abcd.txt"));
		Strudent stu2 = (Strudent) obj.readObject();
		System.out.println(stu2.toString());
	}

}
