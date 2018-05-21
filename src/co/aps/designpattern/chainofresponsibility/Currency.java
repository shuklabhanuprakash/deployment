package co.aps.designpattern.chainofresponsibility;

public class Currency {

	int amount;

	Currency(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return this.amount;
	}
}
