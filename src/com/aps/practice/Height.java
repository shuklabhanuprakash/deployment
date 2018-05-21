package com.aps.practice;

public class Height {

	public static void main(String[] args) {

		String height[] = new String[] { "4#11", "6#0", "5#2", "6#1", "7#1",
				"5#11", "5#11", "5#10", "5#8" };

		System.out.println(getHeight(height, 9));
	}

	private static int getHeight(String[] height, int arrayLength) {
		String h[];
		int counter = 0;
		if (isEmpty(height)) {
			return -1;
		}
		if (arrayLength != height.length) {
			return -1;
		}
		for (int i = 0; i < height.length; i++) {
			h = height[i].split("#");
			int x = Integer.valueOf(h[0]);
			int y = Integer.valueOf(h[1]);
			if (validHeights(x, y)) {
				return -1;
			}
			for (int j = i + 1; j < height.length; j++) {
				h = height[j].split("#");
				int x1 = Integer.valueOf(h[0]);
				int y1 = Integer.valueOf(h[1]);
				if (validHeights(x1, y1)) {
					return -1;
				}
				if ((x * 12 + y) > (x1 * 12 + y1)) {
					counter++;
				}
			}
		}
		return counter;

	}

	private static boolean validHeights(int x, int y) {
		return x < 4 || x > 7 || y < 0 || y > 11;
	}

	private static boolean isEmpty(String[] height) {
		return height == null || height.length == 0;
	}

}
