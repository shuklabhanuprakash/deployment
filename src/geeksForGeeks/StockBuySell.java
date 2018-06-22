package geeksForGeeks;

public class StockBuySell {

	public static void main(String[] args) {

		// when buy and sell only once

		int arr[] = { 20, 80, 10, 150, 250, 10 };

		buySell(arr);
		maxProfit(arr);
		// buy sell twice

	}

	private static void buySell(int[] arr) {

		if (arr.length < 2) {
			return;
		}
		int maxProfile = 0;
		int buy = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (buy > arr[i]) {
				buy = arr[i];

			} else {
				if (maxProfile < arr[i] - buy) {
					maxProfile = arr[i] - buy;
				}

			}
		}
		if (maxProfile == 0) {
			System.out.println("NO buy no sell");
			return;
		}

		System.out.println(" the max profile would be " + maxProfile + "");

	}

	static void maxProfit(int[] arr) {

		
		int total = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] < arr[i])
				total += arr[i] - arr[i - 1];
		}
		System.out.println(total);

	}

}

class Stock {

	int buy;
	int sell;

	Stock(int buy, int sell) {
		this.buy = buy;
		this.sell = sell;
	}
}