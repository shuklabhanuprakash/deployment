package com.aps.java.serialization;

import java.io.Serializable;

public class Strudent implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/**
	 *
	 */
	// private static final long serialVersionUID = -5267785852671985653L;
	// private Integer id;
	private String name;
	private Integer age;

	private String address;

	/*
	 * public Integer getId() { return id; }
	 *
	 * public void setId(Integer id) { this.id = id; }
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name " + this.name + " address  " + this.address + " age"
				+ this.age;// + " id" + this.id;
	}
}
