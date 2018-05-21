package com.aps.threadtest;

import java.util.ArrayList;
import java.util.List;

public class PingPong {

	public static void main(String[] args) throws InterruptedException {

		List<Integer> capacity = new ArrayList<Integer>();
		Ping ping = new Ping(capacity, 1);
		Pong pong = new Pong(capacity, 1);
		ping.start();
		pong.start();

	}

}
