package com.aps.collection.hasmap;

public class CustomException {

	private final int count;

	public CustomException() {
		this.count = 0;
	}

	public CustomException(CustomException c) {
		count = c.count;
	}

	public static void main(String[] args) {
		new CustomException(new CustomException());

	}

}
