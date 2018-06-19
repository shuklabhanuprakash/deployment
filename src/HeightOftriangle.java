public class HeightOftriangle {
	public static void main(String args[]) {
		int height = calculateHeight(4);
		System.out.println(height);
	}

	private static int calculateHeight(int coins) {
		int sum = 0;
		int height = 1;
		while (sum < coins) {
			sum = sum + height;
			height++;
		}
		if (sum > coins) {
			height--;
		}
		return height - 1;
	}

}
