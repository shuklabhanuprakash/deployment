public class TriangleCoins {
	public static double calculateHeight(int noOfCoins) {
		double res = ((-1 + (Math.sqrt(1 + 8 * noOfCoins))) / 2);
		while ((res - Math.floor(res) > 0)) {
			res = ((-1 + (Math.sqrt(1 + 8 * noOfCoins))) / 2);
			noOfCoins--;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(calculateHeight(3));
	}
}